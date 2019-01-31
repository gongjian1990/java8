package com.thread.thread1;

import org.junit.Test;

public class Test1 {

    public static void main(String[] args) {
//        MyThread2 thread1 = new MyThread2(1);
//        MyThread2 thread2 = new MyThread2(2);
//        MyThread2 thread3 = new MyThread2(3);
//        MyThread2 thread4 = new MyThread2(4);
//        MyThread2 thread5 = new MyThread2(5);
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();

//        MyThread3 thread3 = new MyThread3();
//        Thread t1 = new Thread(thread3);
//        t1.start();
//        System.out.println("运行结束");

        /**
         * 不共享变量
         */
//        MyThread4 a = new MyThread4("a");
//        MyThread4 b = new MyThread4("b");
//        MyThread4 c = new MyThread4("c");
//        MyThread4 d = new MyThread4("d");
//
//        a.start();
//        b.start();
//        c.start();
//        d.start();

        /**
         * 共享变量
         */
        MyThread5 myThread = new MyThread5();
        Thread a = new Thread(myThread,"a");
        Thread b = new Thread(myThread,"b");
        Thread c = new Thread(myThread,"c");
        Thread d = new Thread(myThread,"d");
        Thread e = new Thread(myThread,"e");
        Thread f = new Thread(myThread,"f");
        Thread g = new Thread(myThread,"g");
        Thread h = new Thread(myThread,"h");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        f.start();
        g.start();
        h.start();

    }

    @Test
    public void test1(){

        Integer i1 = 128;
        Integer i2 = 128;

        System.out.println(i1==i2);
    }

}
