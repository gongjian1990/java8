package com.thread.thread1;

public class MyThread7 extends Thread{

    @Override
    public void run() {

        for (int i = 0; i < 300000; i++) {

            System.out.println("i="+(i+1));
        }
    }
}
