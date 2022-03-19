package com.example.recursion;
import java.time.Duration;
import java.time.Instant;
import java.util.stream.LongStream;

/**
 * La recursividad es un mecanismo de control en el que se permite que una función se invoque a
 * sí misma.
 *
 * Las funciones recursivas podrían tardar más tiempo en ejecutarse comparado a las funciones
 * iterativas debido a la sobrecarga adicional de llamadas a métodos adicionales que se almacenan en la pila.
 *
 * Tail Recursion - la llamada al método recursivo debe estar al final
 * Head Recursion - la llamada al método recursivo debería estar al comienzo después de
 * las condiciones de salida
 *
 * Each recursive call will add a new frame to the stack memory of the JVM.
 * This potential problem can be averted by leveraging tail-recursion optimization.
 */
public class Main1 {

    /**
     * FACTORIAL
     * @param args
     */
    public static void main(String[] args) {

        Long number = 20L;

        System.out.println("FACTORIAL ITERATIVO:");
        Instant start = Instant.now();
        long result = factorialIterative(number);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        System.out.println("Tiempo ejecución: " + timeElapsed);
        System.out.println("Resultado: " + result);
        System.out.println("=================");

        System.out.println("FACTORIAL RECURSIVO:");
        Instant start2 = Instant.now();
        long result2 = factorialRecursive(number);
        Instant finish2 = Instant.now();
        long timeElapsed2 = Duration.between(start2, finish2).toNanos();
        System.out.println("Tiempo ejecución: " + timeElapsed2);
        System.out.println("Resultado: " + result2);
        System.out.println("=================");

        System.out.println("FACTORIAL RECURSIVO TAIL:");
        Instant start3 = Instant.now();
        long result3 = factorialTailRecursive(number);
        Instant finish3 = Instant.now();
        long timeElapsed3 = Duration.between(start3, finish3).toNanos();
        System.out.println("Tiempo ejecución: " + timeElapsed3);
        System.out.println("Resultado: " + result3);
        System.out.println("=================");


    }

    static long factorialIterative(Long n){
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /* No es tail-recursive porque el valor retornado por factorialRecursive(n-1)
     * es usado */
    static long factorialRecursive(Long n) {
        if (n == 1)
            return 1;
        return n * factorialRecursive(n-1);
    }

    static long factorialTailRecursive(long n) {
        return factorialHelper(1, n);
    }
    static long factorialHelper(long acumulador, long n) {
        if (n == 1)
            return acumulador;

        return factorialHelper(acumulador * n, n-1);
    }

    static long factorialStreams(Long n){
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long a, long b) -> a * b);
    }

    public static int factOverflow(int number){
        // condición base equivocada (esto causa
        // stack overflow).
        if (number == 100)
            return 1;
        else
            return number * factOverflow(number-1);
    }
}
