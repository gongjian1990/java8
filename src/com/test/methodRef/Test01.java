package com.test.methodRef;

import org.junit.Test;

import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 * 练习方法引用
 */
public class Test01 {

    @Test
    public void test01(){


        BinaryOperator<Double> b = (x,y)->Math.pow(x,y);

        Double apply = b.apply(2.1, 3.1);

        System.out.println(apply);

        /**
         * 方法引用
         */
        //等同于
        BinaryOperator<Double> b1 = Math::pow;

        System.out.println("----------------------------");

    }

    /**
     * 构造器引用
     */
    @Test
    public void test02(){

        Function<String,String> f1 = x->new String();

        Function<String,String> f2 = String::new;

    }

    /**
     * 数组引用
     */
    public void test03(){

        Function<Integer,Integer[]> f1= (n)->new Integer[n];

        Function<Integer,Integer[]> f2= Integer[]::new;



    }

}
