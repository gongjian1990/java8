package com.thread.thread1;

public class LoginServlet {

    private static String usernameRef;
    private static String passwordRef;

    public synchronized static void doPost(String username,String password){
        try {
            usernameRef = username;
            if(username.equals("a")){
               Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username="+usernameRef+" password="+password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
