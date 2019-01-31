package com.thread.thread1;

public class Thread1 extends Thread{

//    private int i= 0;
//    @Override
//    public void run() {
//
//        try {
//            while (true){
//                i++;
//                System.out.println("i="+i);
//                Thread.sleep(1000);
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }

    @Override
    public void run() {

        try {
            this.stop();
        } catch (ThreadDeath e) {
            System.out.println("进入 catch 方法  ");
            e.printStackTrace();
        }

    }
}
