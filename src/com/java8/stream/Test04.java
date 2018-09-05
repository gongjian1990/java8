package com.java8.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Stream 终止操作
 */
public class Test04 {

    List<User> list1 = Arrays.asList(
            new User(1,"张三",13),
            new User(2,"李四",78),
            new User(3,"王五",23),
            new User(4,"赵六",63),
            new User(4,"赵六",63)
    );

    /**
     * Stream 终止操作 allMatch
     */
    @Test
    public void test01(){
        boolean b = list1.stream()
                .allMatch(x -> x.getAge() > 0);

        System.out.println(b);
    }

    /**
     * Stream 终止操作 anyMatch
     */
    @Test
    public void test02(){
        boolean b = list1.stream()
                .anyMatch(x -> x.getAge() <30);

        System.out.println(b);
    }

    /**
     * Stream 终止操作 noneMatch
     */
    @Test
    public void test03(){
        boolean b = list1.stream()
                .noneMatch(x -> x.getAge() <30);

        System.out.println(b);
    }

    /**
     * Stream 终止操作 findFirst
     */
    @Test
    public void test04(){
        Optional<User> first = list1.stream()
                .findFirst();

        System.out.println(first.get());
    }

    /**
     * Stream 终止操作 findAny
     */
    @Test
    public void test05(){
        Optional<User> first = list1.stream()
                .findAny();

        System.out.println(first.get());
    }




}
