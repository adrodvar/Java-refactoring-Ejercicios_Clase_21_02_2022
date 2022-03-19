package com.example.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        Runnable runnableTask = () -> {
            try {
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Callable<String> callableTask = () -> {
            TimeUnit.MILLISECONDS.sleep(300);
            return "Task's execution";
        };

        List<Callable<String>> callableTasks = new ArrayList<>();
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);

        executor.execute(runnableTask);

        Future<String> future = executor.submit(callableTask);
        String result = null;
        try {
            result = future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        result = future.get(200, TimeUnit.MILLISECONDS);

        boolean canceled = future.cancel(true);
        boolean isCancelled = future.isCancelled();

        String result2 = executor.invokeAny(callableTasks);

        List<Future<String>> futures = executor.invokeAll(callableTasks);

        executor.shutdown();

        List<Runnable> notExecutedTasks = executor.shutdownNow();


    }
}
