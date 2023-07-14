package com.javadev.ces.demo;

public class Clock {
    private ClockMode mode;

    public Clock(ClockMode clockMode) {
        this.mode = clockMode;
    }

    public void setMode(ClockMode clockMode) {
        this.mode = clockMode;
    }

    public void start() {
        mode.start();
    }

    public void stop() {
        mode.stop();
    }

    public void reset() {
        mode.reset();
    }
}
