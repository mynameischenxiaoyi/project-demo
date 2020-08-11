package com.yichen.lambda;

import com.yichen.lambda.Formula;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class TestFormula  {



    static int num = 1;
    void scopes(){
        Formula formula =(int a)->{
            num=1;
            Integer.valueOf(a+num);
            System.out.println("haha");
        } ;
    }

    public static void main(String[] args) {


        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
        stringCollection.stream().filter(str -> {
            return str.startsWith("a");
        }).collect(Collectors.toList()).stream().forEach(System.out::println);





/*        for (String s:stringCollection){

            if("bbb2".equals(s)){
                stringCollection.remove(s);
                System.out.println("数据移除"+s);
            }

        }
        System.out.println(stringCollection.toString());*/




    }


}
