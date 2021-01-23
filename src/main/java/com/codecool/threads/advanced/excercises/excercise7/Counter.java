package com.codecool.threads.advanced.excercises.excercise7;

import java.util.concurrent.CountDownLatch;

public class Counter extends Thread {
    CountDownLatch finishSignal;
    int maxValue;
    int count;

    Counter(CountDownLatch finishSignal, int maxValue) {
        this.finishSignal = finishSignal;
        this.maxValue = maxValue;
        this.count = 0;
    }

    public void run(){
        while (count < maxValue) {
            try {
                sleep(1000);
                System.out.println(currentThread() + ": step " + count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
        }
        System.out.println(currentThread() + " has finished.");
        finishSignal.countDown();
    }
}
