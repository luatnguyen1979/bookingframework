package com.asd.lab1.probs;

/**
 * Created by Sandip on 4/28/16.
 */
public class Singleton {
    private static Singleton uniqueInstance = null;
    public synchronized static Singleton getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new Singleton();
        return uniqueInstance;
    }

    private Singleton() {
    }
}
