package com.designMode_23.singleton;

/**
 * 静态内部类式
 *
 * 饿汉式是只要Singleton类被装载了，那么instance就会被实例化（没有达到lazy loading效果），而这种方式是Singleton类被装载了，instance不一定被初始化。
 * 因为SingletonHolder类没有被主动使用，只有显示通过调用getInstance方法时，才会显示装载SingletonHolder类，从而实例化instance。
 */
public class StaticInnerClassSingleton {

    private static class SingletonHolder{
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton(){

    }

    public static StaticInnerClassSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
