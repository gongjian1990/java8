package com.thread.thread10;

public class C {

    private Object lock;

    public C(Object lock) {
        this.lock = lock;
    }

    public void getValue(){

        try {
            synchronized (lock){
                if (ValueObject.value.equals("")){
                    lock.wait();
                }
                System.out.println("get 的 值："+ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
