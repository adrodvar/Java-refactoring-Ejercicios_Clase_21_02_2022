package com.example.recursion;

import java.time.Duration;
import java.time.Instant;

public class Main2 {
    /**
     * SUMA todos los números desde 0 hasta number
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("SUMA ITERATIVA:");
        Instant start = Instant.now();
        int result = iterativeSum(500);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        System.out.println("Tiempo ejecución: " + timeElapsed);
        System.out.println("Resultado: " + result);
        System.out.println("==========");

        System.out.println("SUMA RECURSIVA:");
        Instant start2 = Instant.now();
        int result2 = recursiveSum(6);
        Instant finish2 = Instant.now();
        long timeElapsed2 = Duration.between(start2, finish2).toNanos();
        System.out.println("Tiempo ejecución: " + timeElapsed2);
        System.out.println("Resultado: " + result2);
        System.out.println("==========");

        System.out.println("SUMA RECURSIVA TAIL:");
        Instant start3 = Instant.now();
        int result3 = tailSum(0,6);
        Instant finish3 = Instant.now();
        long timeElapsed3 = Duration.between(start3, finish3).toNanos();
        System.out.println("Tiempo ejecución: " + timeElapsed3);
        System.out.println("Resultado: " + result3);
        System.out.println("==========");

    }

    public static int iterativeSum(int n) {
        int sum = 0;
        if(n < 0)
            return -1;

        for(int i=0; i<=n; i++)
            sum += i;

        return sum;
    }

    public static int recursiveSum(int number){
        if (number >= 1)
            return recursiveSum(number - 1) + number;
        return number;
    }

    public static int tailSum(int acumulador, int number) {
        if (number <= 1)
            return acumulador + number;
        return tailSum(acumulador + number, number - 1);
    }


}
