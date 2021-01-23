package com.codecool.threads.exercise3;

import com.codecool.threads.basics.exercise3.FibonacciGeneratorThread;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new FibonacciGeneratorThread(30);
        thread.start();
        thread.join();
        System.out.println("The fibonacci series calculation has been finished!");
    }
}
