package com.mcw.concurrency;

public class ThreadCreationExample5 {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.printf("My %s is running", Thread.currentThread().getName());
        }, "lambda thread");
        thread.start();
    }
}
