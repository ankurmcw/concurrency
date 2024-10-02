package com.mcw.concurrency;

public class ThreadCreationExample4 {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.printf("My %s is running", Thread.currentThread().getName());
            }
        }, "runnable anonymous thread");

        thread.start();
    }
}
