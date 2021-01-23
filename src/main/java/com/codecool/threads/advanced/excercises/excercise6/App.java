package com.codecool.threads.advanced.excercises.excercise6;

import java.util.concurrent.*;

import static java.lang.Thread.sleep;

public class App {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Callable<Integer> fiboCall = () -> {
            Fibonacci fibo = new Fibonacci();
            int x = fibo.fib(40);
            return x;
        };

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(fiboCall);

        int i = 0;
        while (!future.isDone()) {
            i++;
            System.out.println("Waiting: " + i);
            sleep(10);
        }

        System.out.println(future.get());
    }
}
