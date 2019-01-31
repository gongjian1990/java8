package com.thread.thread8;

public class ThreadB extends Thread {

    private MyList myList;

    public ThreadB(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        try {
            while (true){
                //System.out.println("线程B 执行。。。size="+myList.size());

                if(myList.size()==5){
                    System.out.println("==5 ,线程b要退出了 ");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
