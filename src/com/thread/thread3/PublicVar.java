package com.thread.thread3;

public class PublicVar {

    ;public String usename = "A";
    ;public String password = "AA";

    synchronized public void setValue(String usename,String password){

        try {
            this.usename = usename;
            System.out.println("usename set over ");
            Thread.sleep(5000);

            this.password = password;

            System.out.println("setValue method thread name "+Thread.currentThread().getName()+" username="+usename+" password="+password);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public synchronized void getValue(){
        System.out.println("getValue method thread name "+Thread.currentThread().getName()+" username="+usename+" password="+password);
    }


}
