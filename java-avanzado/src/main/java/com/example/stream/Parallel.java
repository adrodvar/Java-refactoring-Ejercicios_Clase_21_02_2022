package com.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;


public class Parallel {

    public static void main(String[] args) {

        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        // Sequential Sort
        sequentialSort(values);
        
        parallelSort(values);
    }

    private static void parallelSort(List<String> values) {

        long t0 = System.nanoTime();

        long count = values.parallelStream().sorted().filter(s -> s.length() > 0).count();
        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("parallel sort took: %d ms", millis));

// parallel sort took: 472 ms
    }

    private static void sequentialSort(List<String> values) {

        long t0 = System.nanoTime();

        long count = values.stream().sorted().filter(s -> s.length() > 0).count();
        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("sequential sort took: %d ms", millis));

        // sequential sort took: 899 ms
        
    }
}
