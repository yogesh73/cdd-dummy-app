package com.ca.cdd.dummy.lib.threadsclasses;

public class Thread4 implements Runnable {
    @Override
    public void run() {
        System.out.println("I am Thread 4");
    }

    public static String getName() {return "Thread4";
    }
}
