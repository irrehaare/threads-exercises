package com.codecool.threads.basics.exercise4;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int n=100;
        while (n>0) {
            Counter counter = new Counter();

            int limit = 200_000;

            Incrementer incrementer1 = new Incrementer(counter, limit);
            Incrementer incrementer2 = new Incrementer(counter, limit);

            incrementer1.start();
            incrementer2.start();

            incrementer1.join();
            incrementer2.join();

            System.out.printf("Expected: %s | Current: %s%n", limit * 2, counter.getCount());
            n--;
        }
    }

}
