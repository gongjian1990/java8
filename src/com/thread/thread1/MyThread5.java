package com.thread.thread1;

public class MyThread5 extends Thread {

    private int count = 5;

    @Override
    public synchronized void run() {
        super.run();
        count--;
        System.out.println("由"+Thread.currentThread().getName()+"计算，count"+count);
    }
}
