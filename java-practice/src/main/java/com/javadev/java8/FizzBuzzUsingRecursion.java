package com.javadev.java8;

public class FizzBuzzUsingRecursion {
    public static void main(String[] args) {
        int limit = 100;
        playFizzBuzz(limit);
    }

    private static void playFizzBuzz(int n) {
        if(n > 0) {
            playFizzBuzz(n -1);

            if(n % 3 == 0 && n % 5 ==0) {
                System.out.println("FizzBuzz");
            } else if(n % 3 == 0) {
                System.out.println("Fizz");
            } else if (n % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(n);
            }
        }
    }
}
