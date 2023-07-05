package com.javadev.singleton;

public class ThreadSafeSingleSynchronizedBlock {
    private static ThreadSafeSingleSynchronizedBlock instance;

    private ThreadSafeSingleSynchronizedBlock() {

    }

    public static ThreadSafeSingleSynchronizedBlock getInstance() {
        if(instance == null) {
            synchronized (ThreadSafeSingleSynchronizedBlock.class) {
                if(instance == null) {
                    instance = new ThreadSafeSingleSynchronizedBlock();
                }
            }
        }
        return instance;
    }
}
