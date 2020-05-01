package com.angma02.ds.threads;

public class Sample {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Tasks());

            thread.start();
            ;
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
