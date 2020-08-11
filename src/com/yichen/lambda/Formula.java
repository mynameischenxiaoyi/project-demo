package com.yichen.lambda;

@FunctionalInterface
public interface Formula {
   // int add(int a);

    void addNoReturn(int a);


    default double doubleAdd(int a) {
        return a+a;
    }
}
