package com.yichen.designPattern.singletonPattern;

public class TestEnum {
    public static void main(String[] args) {
        System.out.println(Color.RED.getCode());
        System.out.println(Color.RED.getColor());
        Color.RED.setCode(11);
        System.out.println(Color.RED.getCode());
        System.out.println(Color.RED.getColor());
        System.out.println("RED".equalsIgnoreCase(Color.RED.toString()));
    }
}
