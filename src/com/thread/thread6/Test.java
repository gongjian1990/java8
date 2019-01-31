package com.thread.thread6;

public class Test {

    public static void main(String[] args) {

        Task task = new Task();
        ThreadA threadA = new ThreadA(task);
        ThreadB threadB = new ThreadB(task);
        threadA.start();
        threadB.start();


    }
}
