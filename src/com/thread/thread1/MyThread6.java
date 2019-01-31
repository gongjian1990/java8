package com.thread.thread1;

public class MyThread6 extends Thread {

    private int i= 5;

    @Override
    public void run() {

        System.out.println("i="+(i--)+" threadName="+Thread.currentThread().getName());

    }
}
