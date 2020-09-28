package com.yichen.effectivejava;

import java.util.ArrayList;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneObject cloneObject = new CloneObject();
        cloneObject.setName("yichen");
        System.out.println(cloneObject);
        CloneObject clone =(CloneObject) cloneObject.clone();
        clone.setName("haha");
        System.out.println(clone);



    }
}
