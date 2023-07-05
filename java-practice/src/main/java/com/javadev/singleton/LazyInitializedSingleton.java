package com.javadev.singleton;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {}

    private static LazyInitializedSingleton getInstance() {
        if(instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
