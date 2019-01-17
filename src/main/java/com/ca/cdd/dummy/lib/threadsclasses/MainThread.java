package com.ca.cdd.dummy.lib.threadsclasses;

import com.ca.cdd.dummy.lib.Library;

import java.util.Arrays;
import java.util.List;

public class MainThread extends Library {

    @Override
    public String toString() {
        return super.toString();
    }


    public MainThread() {

        Thread1 thread1 = new Thread1();
        Thread t1 = new Thread(thread1);
        t1.start();

        Thread2 thread2 = new Thread2();
        Thread t2 = new Thread(thread2);
        t2.start();

        Thread3 thread3 = new Thread3();
        Thread t3 = new Thread(thread3);
        t3.start();

        Thread4 thread4 = new Thread4();
        Thread t4 = new Thread(thread4);
        t4.start();

        Thread5 thread5 = new Thread5();
        Thread t5 = new Thread(thread5);
        t5.start();

    }

    public static List<String> threadsList() {
        List<String> s = Arrays.asList(Thread1.getName(), Thread2.getName(), Thread3.getName(), Thread4.getName(), Thread5.getName());
        return s;
    }

    @Override
    public String getName() {

        String l = "";
        for (String thread : threadsList()) {
            l = l.concat(thread + "\n");
        }
        return "Following Threads\\classes were run:\n\n" + l;
    }

}