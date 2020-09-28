package com.yichen.threadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

public class TestCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "helli";
    }

    public static void main(String[] args) {
        FutureTask futureTask = new FutureTask(new TestCallable());
        new Thread(futureTask).start();
        try {
            Object o = futureTask.get();
            System.out.println(o);
        }catch (Exception e){

        }

    }


}
