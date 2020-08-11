package com.yichen.someTest;

import java.util.HashMap;

public class FinalTest {
    final static HashMap<Integer,String> map=new HashMap<>(8);

    public static void main(String[] args) {
        for (int i=0;i<1000;i++){
            map.put(i,"123");
        }
        System.out.println(map);

    }
}
