package com.javadev.java8;

import java.util.stream.IntStream;

public class FizzBuzzUsingStreams {
    public static void main(String[] args) {
        int end = 100;
        IntStream.rangeClosed(1,end)
                .mapToObj( i -> i % 3 == 0 ?
                        (i % 5 == 0 ? "FizzBuzz" : "Fizz") :
                        (i % 5 == 0 ? "Buzz" : i)).forEach(System.out::println);
    }
}
