package com.thread.thread2;

public class Test {

    public static void main(String[] args) {

        HesSelfPrivateNum hesSelfPrivateNum1 = new HesSelfPrivateNum();
        HesSelfPrivateNum hesSelfPrivateNum2 = new HesSelfPrivateNum();
        ThreadA a= new ThreadA(hesSelfPrivateNum1);
        a.start();
        ThreadB b= new ThreadB(hesSelfPrivateNum2);
        b.start();


    }
}
