package com.javadev.threading;

import java.util.concurrent.TimeUnit;

public class Counter extends Thread {
    Integer count = 0;
    @Override
    public void run() {
        int fixed = 6;

        for(int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " : result = " + performCount(fixed));

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " is executing...");
        Counter counter = new Counter();

        for(int i= 0; i <5 ;i++) {
            Thread t = new Thread(counter);
            t.start();
        }
    }

    private int performCount(int fixed) {
        return (fixed + ++count);
    }
}
