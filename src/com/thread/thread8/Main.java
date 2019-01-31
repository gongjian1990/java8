package com.thread.thread8;

public class Main {

    public static void main(String[] args) {

        MyList list = new MyList();
        ThreadA threadA = new ThreadA(list);
        threadA.start();
        ThreadB threadB = new ThreadB(list);
        threadB.start();


    }
}
