package com.thread.thread4;

public class MyThread extends Thread {

    @Override
    public void run() {
        Service service = new Service();
        service.service1();

    }
}
