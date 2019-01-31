package com.thread.thread2;

public class HesSelfPrivateNum {

    // 实例变量非线程安全
    private int num = 0;

    // 添加 synchronized 关键字 同步
    public synchronized void addI(String username){
        try {
            // 方法内变量为线程安全
            //int num = 0;
            if(username.equals("a")){
                num = 100;
                System.out.println("set a over !");
                Thread.sleep(2000);
            }else {
                num = 200;
                System.out.println("set b over !");
            }
            System.out.println(username+" num="+num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
