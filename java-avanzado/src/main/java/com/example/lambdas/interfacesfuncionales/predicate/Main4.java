package com.example.lambdas.interfacesfuncionales.predicate;

import java.util.function.Predicate;

public class Main4 {

    public static void main(String[] args) {

        Integer customerAge = 35;

        Predicate<Integer> gte18 = num -> num >= 18;
        Predicate<Integer> lte30 = num -> num <= 30;

        Predicate<Integer> eligiblePredicate = gte18.and(lte30);
        boolean result = eligiblePredicate.test(customerAge);
        System.out.println(result);
    }
}
