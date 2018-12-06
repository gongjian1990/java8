package com.designMode_23.singleton;

public class VolatileSingleton {

    private static volatile VolatileSingleton instance;

    private VolatileSingleton(){

    }

    public static VolatileSingleton getInstance(){
        if(instance==null){
            synchronized (VolatileSingleton.class){
                if(instance== null){
                    instance = new VolatileSingleton();
                }
            }
        }
        return instance;
    }


}
