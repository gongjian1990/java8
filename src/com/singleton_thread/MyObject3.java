package com.singleton_thread;

/**
 * 懒汉式
 */
public class MyObject3 {

    private MyObject3(){

    }
    private static MyObject3 myObject2 = null;

    public synchronized static MyObject3 getInstance(){
        if(myObject2==null){
            return new MyObject3();
        }
        return myObject2;
    }

}
