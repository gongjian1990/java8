package com.test.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Test03 {

    List<User> list1 = Arrays.asList(
            new User(1,"张三",13),
            new User(2,"李四",78),
            new User(3,"王五",23),
            new User(4,"赵六",63),
            new User(4,"赵六",63)
    );

    List<String> list = Arrays.asList("a","b","d","c");

    /**
     * Stream 中间操作 sorted
     */
    @Test
    public void test01(){
        list.stream()
                .sorted()
                .forEach(System.out::println);

    }

    /**
     * Stream 中间操作 sorted
     */
    @Test
    public void test02(){
        list1.stream()
                .sorted((x,y)->Integer.compare(x.getAge(),y.getAge()))
                .forEach(System.out::println);
    }


}
