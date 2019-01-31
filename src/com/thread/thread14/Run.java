package com.thread.thread14;

public class Run {

    public static void main(String[] args) {

        MyService service = new MyService();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.start();

    }
}
