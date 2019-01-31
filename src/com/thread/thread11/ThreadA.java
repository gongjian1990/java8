package com.thread.thread11;

public class ThreadA extends Thread {

    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {

        service.methodA();
    }
}
