package com.example.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class StaticMethod {

    public static void main(String[] args) {

        Function<String, Integer> function = text -> Integer.valueOf(text); // lambda
        Function<String, Integer> function2 = Integer::valueOf; // method reference

        BiFunction<Integer, Integer, Integer> function3 = (num1, num2) -> Integer.compare(num1, num2); // lambda
        BiFunction<Integer, Integer, Integer> function4 = Integer::compare; // method reference

        BiFunction<Integer, Integer, Integer> function5 = (num1, num2) -> {
            System.out.println("hola");
            return Integer.compare(num1, num2);
        }; // aquí no se puede usar method reference porque la lambda llama a 2 métodos


        Predicate<Integer> checkPositive = num -> MathUtils.isPositive(num); // lambda
        Predicate<Integer> checkPositive2 = MathUtils::isPositive; // method reference
    }
}

class MathUtils{
    public static boolean isPositive(int num){
        return num >= 0;
    }
}