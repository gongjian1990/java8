package com.thread.thread13;

public class ThreadA extends Thread {

    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.awaitA();
    }
}
