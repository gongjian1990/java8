package com.thread.thread11;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = new ReentrantLock();

    public void  testMethod(){
        lock.lock();
        for (int i = 0; i < 5; i++) {
            System.out.println("ThreadName="+Thread.currentThread().getName()+" -- "+(i+1));
        }
        lock.unlock();
    }

    public void methodA(){
        try {
            lock.lock();
            System.out.println("method A begin,ThreadName = "+Thread.currentThread().getName()+" time="+System.currentTimeMillis());

            Thread.sleep(5000);

            System.out.println("method A end,ThreadName = "+Thread.currentThread().getName()+" time="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void methodB(){
        try {
            lock.lock();
            System.out.println("method B begin,ThreadName = "+Thread.currentThread().getName()+" time="+System.currentTimeMillis());

            Thread.sleep(5000);

            System.out.println("method B end,ThreadName = "+Thread.currentThread().getName()+" time="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
