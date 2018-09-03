package com.test.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class Test02 {

    List<User> list = Arrays.asList(
            new User(1,"张三",13),
            new User(2,"李四",18),
            new User(3,"王五",23),
            new User(4,"赵六",63),
            new User(4,"赵六",63)
    );


    /**
     * Stream 中间操作 map
     */

    @Test
    public void test01(){

        list.stream()
                .map(x->x.getAge())
                .forEach(System.out::println);

    }

    /**
     * Stream 中间操作 mapToInt
     */

    @Test
    public void test02(){

        list.stream()
                .mapToInt(x->x.getUid())
                .forEach(System.out::println);
    }


}
