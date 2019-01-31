package com.singleton_thread;

/**
 * 懒汉式
 */
public class MyObject4 {

    private MyObject4(){

    }
    private static MyObject4 myObject2 = null;

    public static MyObject4 getInstance(){
        synchronized (MyObject4.class){
            if(myObject2==null){
                return new MyObject4();
            }
        }
        return myObject2;
    }

}
