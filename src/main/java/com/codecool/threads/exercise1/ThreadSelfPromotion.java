package com.codecool.threads.exercise1;

public class ThreadSelfPromotion extends Thread {
    public void run(){
        System.out.println(currentThread().getName() + "_" +
                currentThread().getState() + "_" +
                currentThread().getId());
    }
}
