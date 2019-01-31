package com.thread.thread10;

public class Main {

    public static void main(String[] args) {

        String lock = "";

        P p = new P(lock);
        C c = new C(lock);

        ThreadP threadP = new ThreadP(p);
        ThreadC threadC = new ThreadC(c);
        threadP.start();
        threadC.start();



    }
}
