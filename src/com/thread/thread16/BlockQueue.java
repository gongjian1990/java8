package com.thread.thread16;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 实现阻塞队列
 */
public class BlockQueue {

    // 容器
    private LinkedList list = new LinkedList();

    // 计数器
    private AtomicInteger count = new AtomicInteger(0);

    // 最小尺寸
    private final int minSize = 0;

    // 最大尺寸
    private final int maxSize;

    // 锁
    private final Object lock = new Object();

    // 构造器
    public BlockQueue(int size){
        this.maxSize = size;
    }

    // put 方法
    public void put(Object obj){
        synchronized (lock){
            while (count.get() == this.maxSize){
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 添加
            list.add(obj);
            // 计数器加1
            count.incrementAndGet();
            // 换线阻塞线程
            lock.notify();
            System.out.println("新加入的元素为:" + obj);

        }
    }

    // take 方法
    public Object take(){
        Object obj = null;
        synchronized (lock){
            while (count.get()==this.minSize){
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 移除元素
            obj = list.removeFirst();
            // 计数器-1
            count.decrementAndGet();
            // 通知阻塞线程
            lock.notify();
        }
        return obj;
    }

    public int getSize(){
        return this.count.get();
    }

    public static void main(String[] args) {

        final BlockQueue mq = new BlockQueue(5);
        mq.put("a");
        mq.put("b");
        mq.put("c");
        mq.put("d");
        mq.put("e");

        System.out.println("当前容器的长度:" + mq.getSize());

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                mq.put("f");
                mq.put("g");
            }
        },"t1");

        t1.start();


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Object o1 = mq.take();
                System.out.println("移除的元素为:" + o1);
                Object o2 = mq.take();
                System.out.println("移除的元素为:" + o2);
            }
        },"t2");


        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
    }

}
