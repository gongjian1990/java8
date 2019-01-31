package com.thread.thread9;

import java.time.LocalDateTime;

public class MyThread1 extends Thread{

    private Object lock;

    public MyThread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {

        try {
            synchronized (lock){
                System.out.println("start wait time"+ LocalDateTime.now());
                lock.wait();
                System.out.println("end wait time="+LocalDateTime.now());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.run();
    }
}
