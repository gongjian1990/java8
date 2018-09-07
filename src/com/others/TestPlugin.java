package com.others;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 测试lombok插件，以及lombok简单使用
 */
@ToString
public class TestPlugin {

    @Setter
    @Getter
    private String name;

    public static void main(String[] args) {
        TestPlugin t = new TestPlugin();
        t.setName("张三");

        System.out.println(t);
    }

}
