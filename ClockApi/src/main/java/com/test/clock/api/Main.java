package com.test.clock.api;

// Main.java
public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock.Builder()
                .mode(Mode.CLOCK)
                .isRunning(false)
                .build();

        // Use the clock object
        System.out.println(clock.getMode()); // CLOCK
        System.out.println(clock.isRunning()); // false

        // Update the clock mode
        clock = new Clock.Builder()
                .mode(Mode.ALARM)
                .isRunning(false)
                .build();

        // Use the updated clock object
        System.out.println(clock.getMode()); // ALARM
        System.out.println(clock.isRunning()); // false

        // Perform clock operations
        clock.start(); // start operation based on the current mode (ALARM)
        System.out.println(clock.isRunning()); // true

        clock.stop(); // stop operation based on the current mode (ALARM)
        System.out.println(clock.isRunning()); // false

        clock.reset(); // reset operation based on the current mode (ALARM)
        System.out.println(clock.isRunning()); // false
    }
}
