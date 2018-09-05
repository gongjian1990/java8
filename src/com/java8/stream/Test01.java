package com.java8.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Test01 {

    List<User> list = Arrays.asList(
            new User(1,"张三",13),
            new User(2,"李四",18),
            new User(3,"王五",23),
            new User(4,"赵六",63),
            new User(4,"赵六",63)
        );


    /**
     * Stream 中间操作 filter
     */

    @Test
    public void test01(){

        list.stream()
                .filter(x -> x.getAge() > 20)
                .forEach(System.out::println);
    }

    /**
     * Stream 中间操作 distinct
     */
    @Test
    public void test02(){

        list.stream()
                .distinct()
                .forEach(System.out::println);
    }

    /**
     * Stream 中间操作 limit
     */
    @Test
    public void test03(){

        list.stream()
                .limit(3)
                .forEach(System.out::println);
    }

    /**
     * Stream 中间操作 skip
     */
    @Test
    public void test04(){

        list.stream()
                .skip(2)
                .forEach(System.out::println);
    }



}
