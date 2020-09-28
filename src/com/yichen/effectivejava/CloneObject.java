package com.yichen.effectivejava;

public class CloneObject implements Cloneable {
    private String name;
    private final Integer age=0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "CloneObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
