package com.codecool.threads.basics.exercise1;

import com.codecool.threads.exercise1.SelfPromote;
import com.codecool.threads.exercise1.ThreadSelfPromotion;

import java.util.ArrayList;

import static java.lang.Thread.currentThread;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Thread> threads = new ArrayList<>();
        threads.add(new Thread(() -> {
            System.out.println(currentThread().getName() + "+" +
                    currentThread().getState() + "+" +
                    currentThread().getId());
        }));
        threads.add(new Thread(new SelfPromote()));
        threads.add(new Thread(new SelfPromote()));
        threads.add(new Thread(new SelfPromote()));
        threads.add(new Thread(new SelfPromote()));
        threads.add(new ThreadSelfPromotion());

        for (Thread thread : threads) {
            thread.start();
            thread.join();
        }
        System.out.println("THE END");
    }
}
