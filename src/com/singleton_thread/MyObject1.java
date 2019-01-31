package com.singleton_thread;

/**
 * 内部类实现
 */
public class MyObject1 {

    private MyObject1(){

    }

    private static class MyObjectHandler{
        private static MyObject1 myObject1 = new MyObject1();

    }

    public static MyObject1 getInstance(){
        return MyObjectHandler.myObject1;
    }

}
