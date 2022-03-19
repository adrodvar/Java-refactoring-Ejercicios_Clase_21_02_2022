package com.example.methodreference;

import java.util.function.Function;

public class InstanceMethod {

    public Double calculateIva(Double price){
        return price * 0.21;
    }
    public static void main(String[] args) {

        InstanceMethod app = new InstanceMethod();

        Function<Double, Double> function1 = price -> app.calculateIva(price); // lambda

        Function<Double, Double> function2 = app::calculateIva; // method reference
        double iva = function2.apply(39.99);
        System.out.println(iva);

    }
}
