package com.java8.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 练习4大函数式接口
 */
public class Test01 {

    /**
     * 练习消费型接口
     * @param s
     * @param c
     */
    public void testConsumer(String s, Consumer<String> c){

        c.accept(s);

    }

    @Test
    public void test01(){
        testConsumer("hello",x->System.out.println(x+"world"));
    }

    /**
     * 练习供给型接口
     * @return
     */
    public List<Integer> testSupplier(Supplier<List<Integer> > s){

        return s.get();
    }

    @Test
    public void test02(){
        List<Integer> list = testSupplier(() -> Arrays.asList(1, 2));
        System.out.println(list);
    }

    /**
     * 练习函数式接口
     * @param s
     * @param f
     * @return
     */
    public String testFunction(String s, Function<String,String> f){
        return f.apply(s);
    }

    @Test
    public void test03(){
        String result = testFunction("aabbcc", x -> x.toUpperCase());

        System.out.println(result);
    }

    /**
     * 练习断言型接口
     * @param s
     * @param p
     * @return
     */
    public boolean testPredicate(String s, Predicate<String> p){
        return p.test(s);
    }

    @Test
    public void test04(){
        boolean b = testPredicate("aabbcc", x -> x.contains("d"));
        System.out.println(b);

    }

}
