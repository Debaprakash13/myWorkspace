package com.javadev.ces.demo;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(new ClockModeClock());
        clock.start();
        clock.stop();

        clock.setMode(new ClockModeAlarm());
        clock.start();
        clock.start();

        clock.setMode(new ClockModeTimer());
        clock.start();
        clock.stop();
    }
}
