package com.thread.thread1;

public class MyThread8 extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 5000000; i++) {

            if(this.isInterrupted()){
                System.out.println("已经停止状态了，我要退出了！");

                try {
                    throw new InterruptedException();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("进入catch 方法。。。");
                }
            }
            System.out.println("i="+(i+1));
        }

        System.out.println("我在for 下面");
        //System.out.println("我被输出，如果此代码是for又继续运行，线程并未停止！");
    }
}
