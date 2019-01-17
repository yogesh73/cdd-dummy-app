package com.ca.cdd.dummy.lib.threadsclasses;

public class Thread5 implements Runnable {
    @Override
    public void run() {
        System.out.println("I am Thread 5");
    }

    public static String getName() {return "Thread5";
    }
}
