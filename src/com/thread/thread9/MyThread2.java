package com.thread.thread9;

import java.time.LocalDateTime;

public class MyThread2 extends Thread{

    private Object lock;

    public MyThread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {

        synchronized (lock){
            System.out.println("start notify time"+ LocalDateTime.now());
            lock.notify();
            System.out.println("end notify time="+LocalDateTime.now());
        }
    }
}
