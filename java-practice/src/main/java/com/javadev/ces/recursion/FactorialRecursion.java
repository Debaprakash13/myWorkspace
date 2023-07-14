package com.javadev.ces.recursion;

public class FactorialRecursion {
    public static void main(String[] args) {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        System.out.println(factorialRecursion.fact(3));
    }

    private int fact(int i) {
        int result;

        if(i == 1)
            return 1;

        result = fact(i-1) * i;
        return  result;
    }
}
