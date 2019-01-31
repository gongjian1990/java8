package com.thread.thread1;

public class Mythread9 extends Thread {

    @Override
    public void run() {

        try {

            for (int i = 0; i < 10000000; i++) {
                System.out.println("i="+(i+1));
            }
            System.out.println("run begin 。。。");

            Thread.sleep(200000);

            System.out.println("run end 。。。");
        } catch (InterruptedException e) {
            System.out.println("先停止，再遇到sleep！进入catch！");
            e.printStackTrace();
        }

    }
}
