package com.javadev.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTest {

    @Test
    public void testFizBuzz(){
        assertEquals ("1", fizzBuzz(1));
        assertEquals("2", fizzBuzz(2));
        assertEquals("Fizz", fizzBuzz(3));
        assertEquals("Fizz", fizzBuzz(6));
        assertEquals("Fizz", fizzBuzz(9));
        assertEquals("Buzz", fizzBuzz(5));
        assertEquals("Buzz", fizzBuzz(10));
        assertEquals("FizzBuzz", fizzBuzz(15));
        assertEquals("FizzBuzz", fizzBuzz(30));
        assertEquals("FizzBuzz", fizzBuzz(45));
    }

    @ParameterizedTest
    @ValueSource(ints = {3,6,9,12})
    public void testParameterizedFizz(int num) {
        assertEquals("Fizz",fizzBuzz(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {15,30,45})
    public void testParameterizedFizzBuzz(int num) {

    }

    @ParameterizedTest
    @NullSource
    public void testParameterizedNullInput(int num) {

    }

    private String fizzBuzz(int input) {
        if(input % 3 == 0 && input % 5 == 0) {
            return "FizzBuzz";
        }
        if(input % 3 == 0) {
            return "Fizz";
        }

        if(input % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(input);
    }
}
