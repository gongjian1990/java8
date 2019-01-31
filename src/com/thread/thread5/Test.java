package com.thread.thread5;

public class Test {

    public static void main(String[] args) {

//        MyThread thread = new MyThread();
//        thread.start();

        ObjectService objectService = new ObjectService();
        ThreadA threadA = new ThreadA(objectService);
        threadA.setName("a");
        threadA.start();
        ThreadB threadB = new ThreadB(objectService);
        threadB.setName("b");
        threadB.start();
    }
}
