package com.javadev.ces.tdd.java8;

import com.javadev.ces.java8.FizzBuzzUsingForLoop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzUsingForLoopTest {
    FizzBuzzUsingForLoop fizzBuzz;

    @BeforeEach
    void setUp(){
        fizzBuzz = new FizzBuzzUsingForLoop();
    }

    @ParameterizedTest
    @ValueSource(ints = {3,6,9})
    public void testPlayFizz(int number) {
        assertEquals("Fizz", fizzBuzz.doFizzBuzz(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {5,10,15,20,25})
    public void testPlayBuzz(int number) {
        assertEquals("Buzz", fizzBuzz.doFizzBuzz(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {15,30,45,60})
    public void testPlayFizzBuzz(int number) {
        assertEquals("FizzBuzz", fizzBuzz.doFizzBuzz(number));
    }

    @AfterEach
    public void tearDown() {
        fizzBuzz = null;
    }
}
