package com.thread.thread2;

public class ThreadA extends Thread {

    private HesSelfPrivateNum hesSelfPrivateNum;

    public ThreadA(HesSelfPrivateNum hesSelfPrivateNum) {
        this.hesSelfPrivateNum = hesSelfPrivateNum;
    }

    @Override
    public void run() {
        hesSelfPrivateNum.addI("a");
    }
}
