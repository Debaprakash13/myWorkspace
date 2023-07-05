package com.javadev.java8;

public class EvenOddPrintThread implements Runnable{
    Object obj = new Object();
    static int i =1;
    public EvenOddPrintThread(Object obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        Object obj = new Object();
        Runnable th1 = new EvenOddPrintThread(obj);
        Runnable th2 = new EvenOddPrintThread(obj);

        new Thread(th1,"even").start();
        new Thread(th2, "odd").start();
    }

    @Override
    public void run() {
        while (i<=10) {
            if(i % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                synchronized (obj) {
                    System.out.println(Thread.currentThread().getName() +" :" + i);
                    i++;
                    try{
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            if(i%2 != 0 && Thread.currentThread().getName().equals("odd")) {
                synchronized (obj) {
                    System.out.println(Thread.currentThread().getName() +" :" + i);
                    i++;
                    obj.notify();
                }
            }
        }
    }
}
