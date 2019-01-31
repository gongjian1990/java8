package com.thread.thread1;

public class Run {

    public static void main(String[] args)  {
//        ALogin aLogin = new ALogin();
//        aLogin.start();
//
//        BLogin bLogin = new BLogin();
//        bLogin.start();

//        MyThread6 run = new MyThread6();
//        Thread t1= new Thread(run);
////        Thread t2= new Thread(run);
////        Thread t3= new Thread(run);
////        Thread t4= new Thread(run);
////        Thread t5= new Thread(run);
//
//        System.out.println("begin "+t1.isAlive());
//        System.out.println("thread1 id :"+Thread.currentThread().getId());
//        t1.start();
//        Thread.sleep(1000);
//        System.out.println("end "+t1.isAlive());
//
////        t2.start();
////        t3.start();
//        t4.start();
//        t5.start();


            Mythread9 mythread9 = new Mythread9();
            mythread9.start();
           // Thread.sleep(200);
            mythread9.interrupt();

        System.out.println("end！");

        System.out.println("end --- ");


    }

}
