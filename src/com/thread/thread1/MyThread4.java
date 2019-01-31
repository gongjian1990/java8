package com.thread.thread1;

/**
 * 不共享变量
 */
public class MyThread4 extends Thread{

    private int count = 5;

    private String name;

    public MyThread4(String name){
        this.name = name;
    }

    public void run(){

        while (count>0){
            count--;
            System.out.println("由"+Thread.currentThread().getName()+"计算，count"+count);
        }

    }

}
