package com.javadev.demo;

public class ClockModeClock implements ClockMode{
    @Override
    public void start() {
        System.out.println("Clock started");
    }

    @Override
    public void stop() {
        System.out.println("CLock stopped");
    }

    @Override
    public void reset() {
        System.out.println("Clock reset");
    }
}
