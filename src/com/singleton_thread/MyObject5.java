package com.singleton_thread;

public class MyObject5 {

    private MyObject5(){}

    private static MyObject5 instance = null;

    static {
        instance = new MyObject5();
    }

    public static MyObject5 getInstance(){
        return instance;
    }

}
