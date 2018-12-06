package com.designMode_23.singleton;

/**
 * 单例模式:饿汉式
 */
public class Singleton1 {

    // 私有化构造器
    private Singleton1(){

    }

    private static Singleton1 instance = new Singleton1();

    //对外提供获取实例方法

    public static Singleton1 getInstance(){
        return instance;
    }


}
