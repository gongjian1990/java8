package com.thread.thread7;

public class Main {
    public static void main(String[] args) {

//        PrintString printString = new PrintString();
//        Thread thread = new Thread(printString);
//        thread.start();
//        System.out.println("我要停止它！ stopThread="+Thread.currentThread().getName());
//
//        printString.setContinuePrint(false);

        try {
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRunning(false);
            System.out.println("已经赋值false ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
