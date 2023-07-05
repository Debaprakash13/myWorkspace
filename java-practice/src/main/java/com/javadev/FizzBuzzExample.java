package com.javadev;

public class FizzBuzzExample {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 50 ; i++) {
            FizzBuzzExample.playFizzBuzz(i);
        }
    }

    public static void playFizzBuzz(int num) {
        if(num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if( num % 3 == 0) {
            System.out.println("Fizz");
        } else if(num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(String.valueOf(num));
        }
    }
}
