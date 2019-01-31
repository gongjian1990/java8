package com.singleton_thread;

/**
 * 饿汉式
 */
public class MyObject {

    private MyObject(){

    }
    public static MyObject myObject = new MyObject();

    public static MyObject getInstance(){
        return myObject;
    }



}
