package com.thread.thread11;

public class Mythread extends Thread {

    private MyService service;

    public Mythread(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {

        service.testMethod();

    }
}
