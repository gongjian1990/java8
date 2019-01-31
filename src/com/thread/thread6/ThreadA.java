package com.thread.thread6;

public class ThreadA extends Thread{

    private Task task;

    public ThreadA(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        task.doLongTimeTask();
    }
}
