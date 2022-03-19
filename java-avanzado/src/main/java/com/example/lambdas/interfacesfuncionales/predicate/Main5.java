package com.example.lambdas.interfacesfuncionales.predicate;

import java.util.function.DoublePredicate;

public class Main5 {

    private static final double MINIMUM_ORDER_PRICE = 50;

    public static void main(String[] args) {

        double productPrice = 51;

        boolean result1 = checkPrice(productPrice, price -> price >= MINIMUM_ORDER_PRICE);
        System.out.println(result1);
    }

    private static boolean checkPrice(double price, DoublePredicate predicate){
        return predicate.test(price);
    }
}
