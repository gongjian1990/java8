package com.thread.thread11;

public class Run {

    public static void main(String[] args) {

        MyService service = new MyService();
//        Mythread a1 = new Mythread(service);
//        Mythread a2 = new Mythread(service);
//        Mythread a3 = new Mythread(service);
//        Mythread a4 = new Mythread(service);
//        Mythread a5 = new Mythread(service);
//
//        a1.start();
//        a2.start();
//        a3.start();
//        a4.start();
//        a5.start();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("a");
        threadA.start();
        ThreadAA threadAA = new ThreadAA(service);
        threadAA.setName("aa");
        threadAA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.setName("b");
        threadB.start();
        ThreadBB threadBB = new ThreadBB(service);
        threadBB.setName("bb");
        threadBB.start();

    }
}
