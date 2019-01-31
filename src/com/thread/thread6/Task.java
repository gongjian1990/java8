package com.thread.thread6;

public class Task {

    public void  doLongTimeTask(){

        for (int i = 0; i < 100; i++) {
            System.out.println("no synchronized threadName ="+Thread.currentThread().getName()+" i="+(i+1));
        }

        synchronized (this){
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized threadName ="+Thread.currentThread().getName()+" i="+(i+1));
            }
        }
    }
}
