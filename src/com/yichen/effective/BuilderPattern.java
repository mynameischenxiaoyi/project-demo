package com.yichen.effective;

public class BuilderPattern {
    private final String naem;
    private final Integer age;
    private final Integer sex;

    public BuilderPattern(Builder builder) {
        this.naem = builder.naem;
        this.age = builder.age;
        this.sex=builder.sex;
    }

    @Override
    public String toString() {
        return "BuilderPattern{" +
                "naem='" + naem + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public static class Builder{

        public String naem;
        public Integer age;
        private Integer sex;

        public Builder(String naem, Integer age) {
            this.naem = naem;
            this.age = age;
        }

        public Builder sex(Integer sex){
            this.sex=sex;
            return this;
        }


        public  BuilderPattern builder(){
           return new BuilderPattern(this);
        }
    }

    public static void main(String[] args) {
        BuilderPattern chenyi = new Builder("chenyi", 12).sex(12).builder();
        System.out.println(chenyi);
    }
}
