package com.test.optional;

import org.junit.Test;

import java.util.Optional;

/**
 * Optional 容器类
 */
public class Test01 {

    @Test
    public void test1(){

        Optional<Integer[]> op1 = Optional.of(new Integer[2]);

        System.out.println(op1.get());


//        Optional<Object> op2 = Optional.of(null);
//
//        System.out.println(op2);

//        Optional<Object> empty = Optional.empty();
//
//        System.out.println(empty.get());

        System.out.println(op1.isPresent());

    }
}
