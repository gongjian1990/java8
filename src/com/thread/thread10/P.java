package com.thread.thread10;

import java.util.Random;

public class P {

    private String lock;

    public P(String lock) {
        this.lock = lock;
    }

    public void setValue(){

        try {
            synchronized (lock){
                if(!ValueObject.value.equals("")){
                    lock.wait();
                }
                Random random = new Random();
                String value = random.nextInt()+"";
                System.out.println("set 的 值："+value);

                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
