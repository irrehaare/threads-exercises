package com.codecool.threads.exercise1;

import static java.lang.Thread.currentThread;

public class SelfPromote implements Runnable{

    @Override
    public void run() {
        System.out.println(currentThread().getName() + " " +
                currentThread().getState() + " " +
                currentThread().getId());
    }
}
