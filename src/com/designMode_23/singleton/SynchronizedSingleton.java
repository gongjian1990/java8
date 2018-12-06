package com.designMode_23.singleton;

/**
 * 单例模式：线程安全的懒汉式
 */
public class SynchronizedSingleton {

    private static SynchronizedSingleton instance;

    //私有构造器
    private SynchronizedSingleton(){

    }

    // 对外提供获取实例静态方法,加锁
    public static synchronized SynchronizedSingleton getInstance(){
        if (instance==null){
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
