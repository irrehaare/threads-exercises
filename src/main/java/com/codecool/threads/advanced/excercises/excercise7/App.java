package com.codecool.threads.advanced.excercises.excercise7;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        Counter c1 = new Counter(countDownLatch, 5);
        Counter c2 = new Counter(countDownLatch, 3);
        Counter c3 = new Counter(countDownLatch, 7);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(c1);
        executorService.submit(c2);
        executorService.submit(c3);

        countDownLatch.await();
        System.out.println("All your counts are belong to us!");
    }

}
