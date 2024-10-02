package com.mcw.concurrency;

public class ThreadCreationExample3 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnableImpl(), "runnable thread");
        thread.start();
    }
}

class MyRunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.printf("My %s is running", Thread.currentThread().getName());
    }
}