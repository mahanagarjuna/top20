package com.angma02.ds.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheSample {

    public static void main(String[] args) {
        int corePoolSize = Runtime.getRuntime().availableProcessors();
        ScheduledExecutorService sService = Executors.newScheduledThreadPool(corePoolSize);

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            sService.schedule(new Task(), 10, TimeUnit.MILLISECONDS);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("TName: " + Thread.currentThread().getName());
        System.out.println("Time taken(sec): " + (endTime - startTime) / 1000);
    }

    static class Task implements Runnable {

        @Override
        public void run() {
            System.out.println("TName: " + Thread.currentThread().getName());
        }

    }

}