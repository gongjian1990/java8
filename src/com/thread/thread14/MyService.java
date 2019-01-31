package com.thread.thread14;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    private boolean hasValue = false;

    public void set(){
        try {
            lock.lock();

            while (hasValue){
                condition.await();
            }
            System.out.println("生产 @@@");
            hasValue = true;

            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void get(){
        try {
            lock.lock();
            while (!hasValue){
                condition.await();
            }
            System.out.println("消费  ###");
            hasValue = false;
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
