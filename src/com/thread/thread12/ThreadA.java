package com.thread.thread12;

public class ThreadA extends Thread {

    private Myservice myservice;

    public ThreadA(Myservice myservice) {
        this.myservice = myservice;
    }

    @Override
    public void run() {
        myservice.await();
    }
}
