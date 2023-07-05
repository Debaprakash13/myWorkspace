package com.test.clock.api;

// Clock.java
public class Clock {
    private Mode mode;
    private boolean isRunning;
    // other necessary fields

    private Clock(Builder builder) {
        this.mode = builder.mode;
        this.isRunning = builder.isRunning;
        // initialize other fields
    }

    public Mode getMode() {
        return mode;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void start() {
        isRunning = true;
        // perform start operation based on the current mode
    }

    public void stop() {
        isRunning = false;
        // perform stop operation based on the current mode
    }

    public void reset() {
        isRunning = false;
        // perform reset operation based on the current mode
    }

    // Builder class
    public static class Builder {
        private Mode mode;
        private boolean isRunning;

        public Builder() {
            // Set default values
            this.mode = Mode.CLOCK;
            this.isRunning = false;
        }

        public Builder mode(Mode mode) {
            this.mode = mode;
            return this;
        }

        public Builder isRunning(boolean isRunning) {
            this.isRunning = isRunning;
            return this;
        }

        public Clock build() {
            return new Clock(this);
        }
    }
}
