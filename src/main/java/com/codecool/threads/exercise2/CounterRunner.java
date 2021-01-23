package com.codecool.threads.exercise2;

import static java.lang.Thread.sleep;

public class CounterRunner implements Runnable {
    private int counter = 1;
    private static final int MAX = 10000;

    @Override
    public void run() {
        System.out.println("Counting started...");
        try {
                while (counter <= MAX) {
                    sleep(200);
                    System.out.println(counter);
                    counter++;
                }
                System.out.println("Counting finished.");
            } catch (InterruptedException e) {
                System.out.println("The forces of evil have interrupted me! I still have " + (MAX-counter+1) + " numbers to count!");
            }

    }
}
