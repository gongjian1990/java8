package com.singleton_thread;

/**
 * 懒汉式
 */
public class MyObject2 {

    private MyObject2(){

    }
    private static MyObject2 myObject2 = null;

    public static MyObject2 getInstance(){
        synchronized (MyObject2.class){
            if(myObject2==null){
                return new MyObject2();
            }
            return myObject2;
        }
    }

}
