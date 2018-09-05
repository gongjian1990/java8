package com.java8.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Stream 终止操作
 */
public class Test05 {

    List<User> list1 = Arrays.asList(
            new User(1,"张三",13),
            new User(2,"李四",78),
            new User(3,"王五",23),
            new User(4,"赵六",63),
            new User(4,"赵六",63)
    );

    /**
     * Stream 终止操作 count 返回流中的总数
     */
    @Test
    public void test01(){
        long count = list1.stream().filter(x -> x.getAge() > 20)
                .count();

        System.out.println(count);

    }

    /**
     * Stream 终止操作 max 返回流中的最大值
     */
    @Test
    public void test02(){
        Optional<User> max = list1.stream().filter(x -> x.getAge() > 20)
                .max((x, y) -> Integer.compare(x.getAge(), y.getAge()));

        System.out.println(max.get());

    }

    /**
     * Stream 终止操作 min 返回流中的最小值
     */
    @Test
    public void test03(){
        Optional<User> max = list1.stream().filter(x -> x.getAge() > 20)
                .min((x, y) -> Integer.compare(x.getAge(), y.getAge()));

        System.out.println(max.get());

    }

    /**
     * Stream 终止操作 forEach 内部迭代
     */
    @Test
    public void test04(){
        list1.stream()
                .forEach(System.out::println);
    }

}
