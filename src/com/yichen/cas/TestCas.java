package com.yichen.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class TestCas {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        System.out.println( atomicInteger.get());
        atomicInteger.compareAndSet(0,2);
        System.out.println( atomicInteger.get());
       // atomicInteger.compareAndSet()

    }
}
