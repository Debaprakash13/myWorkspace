package com.javadev.demo;

public class ClockModeTimer implements ClockMode{
    @Override
    public void start() {
        System.out.println("Timer started");
    }

    @Override
    public void stop() {
        System.out.println("Timer stopped");
    }

    @Override
    public void reset() {
        System.out.println("Timer reset");
    }
}
