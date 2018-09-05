package com.java8.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

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


    @Test
    public void test02(){

        Stream<Integer> stream = Arrays.stream(new Integer[]{1,3,6,9,7});

        //求结合元素的和

//        Integer sum = stream.reduce(0,Integer::sum);
//
//        System.out.println(sum);


        // 最大值

        // stream.reduce(Integer::max).ifPresent(System.out::println);

        // 做逻辑,最大值

        stream.reduce((x,y)->x>y?x:y).ifPresent(System.out::println);

    }

    /**
     * 求所有学生的成绩之和。
     */

    @Test
    public void test03(){

        List<Student> list = getStudents();

//        Optional<Integer> reduce = list.stream().map(x -> x.getScore().getPoint())
//                .reduce((x, y) -> x+y);
//        System.out.println(reduce.get());

        Optional<Score> op = list.stream()
                .map(Student::getScore)
                .reduce((x, y) -> x.add(y));

        System.out.println(op.get().getPoint());

    }


    private List<Student> getStudents() {
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student stu = new Student();

            Score score = new Score();
            score.setPoint(80);
            score.setCourseName("English");

            stu.setId(i);
            stu.setScore(score);

            list.add(stu);
        }
        return list;
    }

}
