package com.designMode_23;

import com.designMode_23.singleton.Singleton1;
import com.designMode_23.singleton.Singleton2;
import com.designMode_23.singleton.StaticInnerClassSingleton;

public class Test1 {

    public static void main(String[] args) {

        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();

        System.out.println(instance1==instance2);

        StaticInnerClassSingleton s1= StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton s2= StaticInnerClassSingleton.getInstance();

        System.out.println(s1==s2);

        Singleton2 instance3 = Singleton2.getInstance();
        Singleton2 instance4 = Singleton2.getInstance();

        System.out.println(instance3==instance4);
    }

}
