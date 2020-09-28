package com.yichen.threadTest;

import java.util.LinkedList;

public class BlockQueue {
    public static void main(String[] args) {
        new Thread(new Produce()).start();
        new Thread(new Consumer()).start();
    }

    public static LinkedList<Double> list = new LinkedList<Double>();
    public static Object o1=new Object();
    static class Produce implements Runnable{
        @Override
        public void run() {
            for (;;){
                synchronized (o1){
                    try {
                        Thread.sleep(100);
                        if(list.size()>10){
                            o1.wait();
                        }
                        list.add(Math.random());
                        o1.notifyAll();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }


            }
        }
    }
    static class Consumer implements Runnable{
        @Override
        public void run() {
            for (;;){
                synchronized (o1){
                    try {
                        Thread.sleep(100);
                        if(list.size()<=0){
                            o1.wait();
                        }
                        Double aDouble = list.removeFirst();
                        System.out.println("数组中消费元素"+aDouble+"，数组的长度为"+list.size());
                        o1.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }
//    public static void main(String[] args) {
//        LinkedList<Double> list = new LinkedList<>();
//        Object notFull = new Object();
//        Object notNull = new Object();
//
//        new Thread(()->{
//            for(;;){
//                synchronized (notFull){
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    if(list.size()>=10){
//                        try {
//                            notFull.wait();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        notNull.notifyAll();
//                    }else {
//
//                        list.add(Math.random());
//                    }
//                }
//
//            }
//
//        },"生产者线程").start();
//
//        new Thread(()->{
//            for(;;){
//                synchronized (notNull){
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    if(list.size()==0){
//                        try {
//                            notNull.wait();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        notFull.notifyAll();
//                    }else {
//                        System.out.println("消费了"+list.pollFirst()+"list长度为"+list.size());
//                    }
//                }
//            }
//        },"消费者线程").start();
//
//    }
//

}
