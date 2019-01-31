package com.thread.thread8;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    private List list = new ArrayList();

    public void add(){
        list.add("张三");
    }

    public int size(){
        return list.size();
    }
}
