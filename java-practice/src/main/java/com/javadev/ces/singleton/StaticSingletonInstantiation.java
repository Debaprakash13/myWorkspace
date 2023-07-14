package com.javadev.ces.singleton;

public class StaticSingletonInstantiation {
    private static StaticSingletonInstantiation instance;

    private StaticSingletonInstantiation() {}

    static {
        try {
            instance = new StaticSingletonInstantiation();
        } catch(Exception e) {
           throw new RuntimeException("An exception occurred while creating the instance of the class");
        }
    }

    public static StaticSingletonInstantiation getInstance() {
        return instance;
    }
}
