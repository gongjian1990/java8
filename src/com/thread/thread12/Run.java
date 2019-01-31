package com.thread.thread12;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        Myservice myservice = new Myservice();
        ThreadA threadA = new ThreadA(myservice);
        threadA.start();
        Thread.sleep(3000);
        myservice.signal();
    }
}
