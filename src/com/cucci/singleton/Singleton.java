package com.cucci.singleton;

public class Singleton {

    private static volatile Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println(singleton.toString());
        return singleton;
    }

    private Singleton() {
    }
}
