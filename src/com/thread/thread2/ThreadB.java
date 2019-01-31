package com.thread.thread2;

public class ThreadB extends Thread {

    private HesSelfPrivateNum hesSelfPrivateNum;

    public ThreadB(HesSelfPrivateNum hesSelfPrivateNum) {
        this.hesSelfPrivateNum = hesSelfPrivateNum;
    }

    @Override
    public void run() {
        hesSelfPrivateNum.addI("b");
    }
}
