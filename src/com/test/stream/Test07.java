package com.test.stream;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * stream 终止操作 收集 collect
 */
public class Test07 {

    List<User> list1 = Arrays.asList(
            new User(1,"张三",13),
            new User(2,"李四",78),
            new User(3,"王五",23),
            new User(4,"赵六",63),
            new User(4,"赵六",63)
    );

    /**
     * Collectors.toList() 收集结果为一个list集合
     */
    @Test
    public void test01(){
        List<User> list = list1.stream().filter(x -> x.getAge() > 20)
                .collect(Collectors.toList());
        System.out.println(list);
    }

    /**
     * Collectors.toSet() 收集结果为一个set集合
     */
    @Test
    public void test02(){
        Set<User> set = list1.stream().filter(x -> x.getAge() > 20)
                .collect(Collectors.toSet());
        System.out.println(set);
    }

    /**
     * Collectors.toCollection() 收集结果存放在新创建的集合中
     */
    @Test
    public void test03(){
        ArrayList<User> list = list1.stream().filter(x -> x.getAge() > 20)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list);

    }

    /**
     * Collectors.counting() 求元素个数
     */
    @Test
    public void test04(){
        Long count = list1.stream().filter(x -> x.getAge() > 20)
                .collect(Collectors.counting());
        System.out.println(count);

    }

    /**
     * Collectors.summingInt() 求和(int)
     */
    @Test
    public void test05(){
        Integer sum = list1.stream()
                .collect(Collectors.summingInt(User::getUid));
        System.out.println(sum);
    }

    /**
     * Collectors.joining() 拼接
     */
    @Test
    public void test06(){
        String joining = list1.stream()
                .map(User::getUname)
                .collect(Collectors.joining());

        System.out.println(joining);
    }

    /**
     * Collectors.maxBy() 根据比较器，返回最大的值
     */
    @Test
    public void test07(){
        Optional<User> collect = list1.stream()
                .collect(Collectors.maxBy((x, y) -> Integer.compare(x.getAge(), y.getAge())));
        System.out.println(collect.get());
    }

    /**
     * Collectors.minBy() 根据比较器，返回最大的值
     */
    @Test
    public void test08(){
        Optional<User> collect = list1.stream()
                .collect(Collectors.minBy((x, y) -> Integer.compare(x.getAge(), y.getAge())));
        System.out.println(collect.get());
    }

    /**
     * Collectors.reducing() 规约产生的类型
     */
    @Test
    public void test09(){
        Integer collect = list1.stream()
                .collect(Collectors.reducing(0, User::getAge, Integer::max));
        System.out.println(collect);
    }
}
