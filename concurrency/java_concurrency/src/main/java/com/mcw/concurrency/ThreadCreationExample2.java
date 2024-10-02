package com.mcw.concurrency;

public class ThreadCreationExample2 {

    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread(), "MyThread");
        thread.start();
    }
}


class MyThread extends Thread {
    @Override
    public void run() {
        System.out.printf("%s is running", Thread.currentThread().getName());
    }
}