package com.javadev.ces.java8;

public class FizzBuzzUsingForLoop {
    public static void main(String[] args) {
        FizzBuzzUsingForLoop obj = new FizzBuzzUsingForLoop();
        for(int i= 1 ; i <= 100; i++) {
            obj.doFizzBuzz(i);
        }
    }

    public String doFizzBuzz(int number) {
        if( number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number %3 == 0) {
            return "Fizz";
        }else if( number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
