package com.example.reactive;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Concurrency {

    public static void main(String[] args) throws InterruptedException {

        // Ejemplo hilo separado
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM:ss");
        System.out.println(LocalDateTime.now().format(f));

        Observable.interval(1, TimeUnit.SECONDS)
                .map(i -> LocalDateTime.now().format(f) + " " + i + " Mississippi")
                .subscribe(System.out::println);
        sleep(5000);

        // Ejemplo secuencial, sin paralelismo:
        Observable.just("Alpha", "Beta", "Gamma")
                .map(s -> intenseCalculation((s)))
                .subscribe(System.out::println);

        Observable.range(1, 3)
                .map(s -> intenseCalculation((s)))
                .subscribe(System.out::println);

        // Ejemplo paralelizado
        Observable.just("Alpha", "Beta", "Gamma")
                .subscribeOn(Schedulers.computation())
                .map(s -> intenseCalculation((s)))
                .subscribe(System.out::println);

        Observable.range(1, 3)
                .subscribeOn(Schedulers.computation())
                .map(s -> intenseCalculation((s)))
                .subscribe(System.out::println);

        sleep(20000);

        // ejemplo paralelizado con zip
        Observable<String> source1 = Observable.just("Alpha", "Beta", "Gamma")
                .subscribeOn(Schedulers.computation())
                .map(Concurrency::intenseCalculation);

        Observable<Integer> source2 = Observable.range(1, 3)
                .subscribeOn(Schedulers.computation())
                .map(Concurrency::intenseCalculation);

        Observable.zip(source1, source2, (s, i) -> s + "-" + i)
                .subscribe(System.out::println);

        sleep(20000);

        Observable<Integer> lengths = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .subscribeOn(Schedulers.computation())
                .map(Concurrency::intenseCalculation)
                .map(String::length);

        lengths.subscribe(i -> System.out.println("Received " + i + " on thread " + Thread.currentThread().getName()));
        lengths.subscribe(i -> System.out.println("Received " + i + " on thread " + Thread.currentThread().getName()));

        sleep(10000);

        long start = System.currentTimeMillis();
        Observable.range(1, 10)
                .map(i -> intenseCalculation(i))
                .subscribe(i -> System.out.println("Received " + i + " " + LocalTime.now()));
        long end = System.currentTimeMillis();
        System.out.println((end - start) + " ms");

        start = System.currentTimeMillis();
        Observable.range(1, 10)
                .flatMap(i -> Observable.just(i)
                        .subscribeOn(Schedulers.computation())
                .map(i2 -> intenseCalculation(i2)))
                .subscribe(i -> System.out.println("Received " + i + " " + LocalTime.now() + " on thread " +
                        Thread.currentThread().getName()));
        end = System.currentTimeMillis();
        System.out.println((end - start) + " ms");
        sleep(20000);


    }

    private static <T> T intenseCalculation(T value) {
        sleep(ThreadLocalRandom.current().nextInt(3000));
        return value;
    }
    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
