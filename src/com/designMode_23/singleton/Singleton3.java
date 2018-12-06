package com.designMode_23.singleton;

/**
 * 单例模式：双重校验锁
 *
 * 通过使用同步代码块的方式减小了锁的范围。这样可以大大提高效率。
 */
public class Singleton3 {

    private static Singleton3 instance;

    private Singleton3(){

    }

    public static Singleton3 getInstance(){
        if(instance==null){
            synchronized (Singleton3.class){
                if(instance== null){
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }


}
