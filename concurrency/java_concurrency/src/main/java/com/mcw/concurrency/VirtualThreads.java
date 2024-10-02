package com.mcw.concurrency;

import java.util.ArrayList;
import java.util.List;

public class VirtualThreads {

    public static void main(String[] args) throws InterruptedException {
        List<Thread> vThreadList = new ArrayList<>();
        int vThreadCount = 10_000;

        for (int i=0; i< vThreadCount; i++) {
            int index = i;
            Thread vThread = Thread.startVirtualThread(() -> {
                int result = 1;
                for (int j=0; j<10; j++) {
                    result *= (j + 1);
                }
                System.out.printf("Result[ %d] = %d%n", index, result);
            });
            vThreadList.add(vThread);
        }

        for (Thread vThread: vThreadList) {
            vThread.join();
        }
    }
}
