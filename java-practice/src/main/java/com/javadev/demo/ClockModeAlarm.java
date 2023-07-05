package com.javadev.demo;

public class ClockModeAlarm implements ClockMode{
    @Override
    public void start() {
        System.out.println("Alarm started");
    }

    @Override
    public void stop() {
        System.out.println("Alarm stopped");
    }

    @Override
    public void reset() {
        System.out.println("Alarm reset");
    }
}
