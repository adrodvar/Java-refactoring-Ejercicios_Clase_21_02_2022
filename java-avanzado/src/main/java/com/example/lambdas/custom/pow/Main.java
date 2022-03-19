package com.example.lambdas.custom.pow;

public class Main {

    public static void main(String[] args) {

        MathPow square = x -> x * x;
        MathPow cube = x -> x * x * x;

        System.out.println("square: " + square.pow(3));
        System.out.println("cube: " + cube.pow(3));

    }
}