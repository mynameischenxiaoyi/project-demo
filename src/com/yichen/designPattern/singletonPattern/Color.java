package com.yichen.designPattern.singletonPattern;

public enum Color {
    RED(1,"红色"),YELLOW(2,"黄色"),BLUE(3,"蓝色");

    int code;
    String color;

    private Color(int code, String color) {
        this.code = code;
        this.color = color;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
