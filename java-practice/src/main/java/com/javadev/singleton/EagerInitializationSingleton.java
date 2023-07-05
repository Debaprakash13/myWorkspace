package com.javadev.singleton;

public class EagerInitializationSingleton {
    private static EagerInitializationSingleton singleton = new EagerInitializationSingleton();

    private EagerInitializationSingleton() {}

    public static EagerInitializationSingleton getInstance() {
        return singleton;
    }
}
