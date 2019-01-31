package com.thread.thread5;

public class ThreadB extends Thread {

    private ObjectService service;

    public ThreadB(ObjectService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.serviceMethod();
    }
}
