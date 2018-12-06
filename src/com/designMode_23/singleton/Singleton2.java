package com.designMode_23.singleton;

/**
 * 单例模式：懒汉式
 */
public class Singleton2 {

    private static Singleton2 instance;

    // 私有构造函数
    private Singleton2(){
    }

    // 对外提供获取实例静态方法
    public static Singleton2 getInstance(){
        if(instance==null){
            instance = new Singleton2();
        }
        return instance;
    }

}
