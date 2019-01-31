package com.thread.thread1;

public class Test3 {

    public static void main(String[] args) {

        try {
            Thread4 thread4 = new Thread4();
            thread4.start();

            Thread.sleep(5000);

            // a
            thread4.suspend();
            System.out.println("a="+System.currentTimeMillis()+" i="+thread4.getI());

            // b
            thread4.resume();
            Thread.sleep(5000);

            // c
            thread4.suspend();
            System.out.println("b="+System.currentTimeMillis()+" i="+thread4.getI());
            Thread.sleep(5000);
            System.out.println("b="+System.currentTimeMillis()+" i="+thread4.getI());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
