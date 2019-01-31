package com.thread.thread1;

public class Thread2 extends Thread {

    private SynchronizedObject object;

    public Thread2(SynchronizedObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.printStr("b","bb");
    }
}
