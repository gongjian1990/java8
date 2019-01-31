package com.thread.thread12;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Myservice {

    private Lock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();

    public void  await(){

        try {
            lock.lock();
            System.out.println("await time :"+System.currentTimeMillis());
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void signal(){

        try {
            lock.lock();
            System.out.println("signal time:"+System.currentTimeMillis());
            condition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
