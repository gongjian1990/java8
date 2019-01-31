package com.thread.thread1;

public class MyThread2 extends Thread{

    private int i;

    public MyThread2(int i){
        this.i= i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
