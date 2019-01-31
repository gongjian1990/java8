package com.thread.thread1;

public class Thread3 extends Thread{

    @Override
    public void run() {
        while (true){
            if(this.isInterrupted()){
                System.out.println("停止了 ");
                return;
            }
            System.out.println("timer="+System.currentTimeMillis());
        }
    }
}
