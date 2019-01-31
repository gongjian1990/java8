package com.thread.thread1;

public class Thread4 extends Thread {

    private long i = 0;

    public long getI(){
        return i;
    }

    @Override
    public void run() {
        while (true){
            i++;
        }
    }
}
