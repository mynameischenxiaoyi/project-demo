package com.yichen.designPattern.singletonPattern;

public class Singleton1 {
    private static class SingletonHolder {
        private static final Singleton1 INSTANCE = new Singleton1();
    }
    private Singleton1 (){}
    public static final Singleton1 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
