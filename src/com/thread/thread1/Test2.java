package com.thread.thread1;

public class Test2 {

    public static void main(String[] args) {
//        try {
//            MyThread7 thread7 = new MyThread7();
//            thread7.start();
//            Thread.sleep(1000);
//            //Thread.currentThread().interrupt();
//            thread7.interrupt();
////            System.out.println("是否停止1？"+Thread.interrupted());
////            System.out.println("是否停止2？"+Thread.interrupted());
//            System.out.println("是否停止1？"+thread7.isInterrupted());
//            System.out.println("是否停止2？"+thread7.isInterrupted());
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("end ");
        try {
//
//
//        Thread1 t1= new Thread1();
//        t1.start();
//        Thread.sleep(8000);
//        t1.stop();


//            SynchronizedObject object = new SynchronizedObject();
//            Thread2 thread2 = new Thread2(object);
//            thread2.start();
//            Thread.sleep(500);
//            thread2.stop();
//            System.out.println(object.getUsername()+" "+object.getPassword());

            Thread3 thread3 = new Thread3();
            thread3.start();
            Thread.sleep(2000);
            thread3.interrupt();


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
