package com.thread.thread1;

/**
 * 第一种，集成thread 类
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {
        super.run();
        //System.out.println("myThread");

        try {


        for (int i = 0; i < 10; i++) {
            int time = (int)(Math.random()*1000);
            Thread.sleep(time);
            System.out.println("run="+Thread.currentThread().getName());

        }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
