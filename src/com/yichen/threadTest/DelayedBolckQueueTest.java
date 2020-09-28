package com.yichen.threadTest;

import com.yichen.Person;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedBolckQueueTest {
    public static class Person implements Delayed {

        @Override
        public long getDelay(TimeUnit unit) {
            return 0;
        }

        @Override
        public int compareTo(Delayed o) {
            return 0;
        }
    }
    public static void main(String[] args) {
        DelayQueue delayQueue = new DelayQueue();
        delayQueue.add(new Person());

    }
}
