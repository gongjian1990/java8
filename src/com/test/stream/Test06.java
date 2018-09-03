package com.test.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 *  Stream 终止操作 规约
 */
public class Test06 {

    List<User> list1 = Arrays.asList(
            new User(1,"张三",13),
            new User(2,"李四",78),
            new User(3,"王五",23),
            new User(4,"赵六",63),
            new User(4,"赵六",63)
    );


    /**
     * reduce(BinaryOperator b)   可以将流中元素反复结合起来，得到一个值。返回Optional<T>
     */
    @Test
    public void test01(){

        Integer sum = list1.stream()
                .map(x -> x.getAge())
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);

    }

}
