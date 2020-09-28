package com.yichen.threadTest;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BlockQueueImp {
    public static void main(String[] args) {
        ReentrantLock lock=new ReentrantLock();
        Condition condition1 = lock.newCondition();
        Condition condition2 = lock.newCondition();
        MyBlockQueue myBlockQueue = new MyBlockQueue(condition2, condition1, lock);
        new Thread(()->{
            for (;;){
                myBlockQueue.add(Math.random());
            }
        }).start();
        new Thread(()->{
            for (;;){
                myBlockQueue.remove();
            }
        }).start();

    }

   public static class MyBlockQueue{
        Condition notFull;
        Condition notNull;
        ReentrantLock lock;
        LinkedList<Double> list =new LinkedList<>();
        public MyBlockQueue(Condition notFull,Condition notNull,ReentrantLock lock) {
            this.notFull=notFull;
            this.notNull=notNull;
            this.lock=lock;
        }
        public void add(Double x){
            try {
                lock.lock();
                if(list.size()>=10){
                    notFull.await();
                }
                list.add(x);
                notNull.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();

            }
        }
        public void remove(){
            try {
                lock.lock();
                if(list.size()==00){
                    notNull.await();
                }
                Double remove = list.remove();
                System.out.println("消费了"+remove+"，长度为"+list.size());
                notFull.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }


}
