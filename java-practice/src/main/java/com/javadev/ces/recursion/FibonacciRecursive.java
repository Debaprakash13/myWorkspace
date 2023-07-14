package com.javadev.ces.recursion;

public class FibonacciRecursive {
    public static void main(String[] args) {
        FibonacciRecursive obj = new FibonacciRecursive();
        System.out.println("fibonacci using recursive :"+obj.fiboRecursive(3));
    }

    public int fiboRecursive(int n) {
        if(n==1 || n==0) return n;
        return fiboRecursive(n-1) + fiboRecursive(n-2);
    }

    public int fiboLoop(int n) {

        return 1;
    }
}
