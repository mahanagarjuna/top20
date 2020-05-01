package com.angma02.ds.threads;

import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecSample {

    public static void main(String[] args) {
        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println("Core Count: " + coreCount);
        ExecutorService service = Executors.newFixedThreadPool(coreCount);

        for (int i = 0; i < 100; i++) {
            service.submit(new Tasks());
        }
        System.out.println("TName: " + Thread.currentThread().getName());
    }

    static class Tasks implements Runnable {

        @Override
        public void run() {
            System.out.println("Thread Name: " + Thread.currentThread().getName());

        }

    }

}