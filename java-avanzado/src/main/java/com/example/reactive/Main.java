package com.example.reactive;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class Main {

    private static String result = "";

    public static void main(String[] args) throws InterruptedException {

        // Ejemplo 1
        Observable<String> observable = Observable.just("Hello");
        observable.subscribe(System.out::println);

        // Ejemplo 2
        Observable<String> observable2 = Observable.fromArray("Hi1", "hi2", "hi3");
        observable2.map(String::toUpperCase)
                .forEach(System.out::println);

        // Ejemplo 3
        Observable<String> myStrings = Observable.just("Alpha", "Beta", "Gamma");
        myStrings.map(String::length)
                .subscribe(System.out::println);

        // Ejemplo 4
        Observable.fromArray("Hi1", "hi2", "hi3")
                .subscribe(i -> result += i,  //OnNext
                        Throwable::printStackTrace, //OnError
                        () -> result += "_Completed" //OnCompleted
                );

        System.out.println(result);

        // Ejemplo 5: shorthand para Observer, si no habría que crear clase anónima
        String[] letters = {"a", "b", "c"};
        Observable.fromArray(letters)
                .scan(new StringBuilder(), StringBuilder::append)
                .subscribe(total -> result += total.toString());
        System.out.println(result);

        // Ejemplo 6
        Observable<Long> secondIntervals = Observable.interval(1, TimeUnit.SECONDS);
        secondIntervals.subscribe(System.out::println); /* Hold main thread for 5 seconds so Observable above has chance to fire */
        Thread.sleep(5000l);


        // ej7
        Observable<String> source = Observable.create(emitter -> {
            emitter.onNext("Word1");
            emitter.onNext("Word2");
            emitter.onNext("Word3");
            emitter.onComplete();
        });
        source.subscribe(System.out::println);
        source.map(String::length).filter(l -> l >= 3).subscribe(System.out::println);


        // ej8
        Observable<String> source2 = Observable.create(emitter -> {
            try {
                emitter.onNext("Word1");
                emitter.onNext("Word2");
                emitter.onNext("Word3");
                emitter.onComplete();
            } catch (Throwable e) {
                emitter.onError(e);
            }
        });
        source2.subscribe(System.out::println, Throwable::printStackTrace);

        // ej
        Observable.range(1, 6)
                .subscribe(s -> System.out.println("RECEIVED: " + s));

        // conditional
        Observable.empty()
                .defaultIfEmpty("Observable is empty")
                .subscribe(s -> result += s);




        // handle errors

        // si no se gestiona la excepción entonces se detiene la ejecución
        Observable.just(5, 2, 4, 0, 3)
                .map(i -> 10 / i)
                .subscribe(i -> System.out.println("RECEIVED: " + i));

        Observable.just(5, 2, 4, 0, 3)
                .map(i -> 10 / i)
                .onErrorReturnItem(-1)
                .subscribe(i -> System.out.println("RECEIVED: " + i),
                        e -> System.out.println("RECEIVED ERROR: " + e));

        Observable.just(5, 2, 4, 0, 3) .map(i -> 10 / i)
                .onErrorReturn(e -> e instanceof ArithmeticException ? -1 : 0)
                .subscribe(i -> System.out.println("RECEIVED: " + i),
                        e -> System.out.println("RECEIVED ERROR: " + e));

        Observable.just("Alpha", "Beta", "Gamma")
                .doOnNext(s -> System.out.println("Processing: " + s))
                .map(String::length)
                .subscribe(i -> System.out.println("Received: " + i));

        // zip
        Observable<String> src1 = Observable.just("Alpha", "Beta", "Gamma");
        Observable<Integer> src2 = Observable.range(1, 6);

        Observable.zip(src1, src2,
                        (s, i) -> s + "-" + i)
                .subscribe(System.out::println);

    }
}
