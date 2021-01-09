package com.codecool.threads.basics.exercise2;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread counter = new Thread(new CounterRunner());
        counter.start();

        sleep(11111);

        counter.interrupt();
    }
}
