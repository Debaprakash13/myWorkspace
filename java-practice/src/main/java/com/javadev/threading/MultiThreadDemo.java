package com.javadev.threading;

public class MultiThreadDemo {
    public static void main(String[] args) {
        int n=8;
        for(int i=0; i < n; i++) {
            MultiThreading multiThreading = new MultiThreading();
            multiThreading.start();
        }
    }
}

class MultiThreading extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
