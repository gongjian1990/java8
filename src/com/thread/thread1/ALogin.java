package com.thread.thread1;

public class ALogin extends Thread {

    @Override
    public void run() {
        LoginServlet.doPost("a","aa");
    }
}
