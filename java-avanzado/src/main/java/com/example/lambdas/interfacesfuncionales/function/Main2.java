package com.example.lambdas.interfacesfuncionales.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main2 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("hibernate", "name", "prueba", "hi");
        List<Integer> lengths = map(names, text -> text.length());
        System.out.println(lengths);

    }

    // Método que recibe una lista y una lambda de tipo Function
    // se usa para procesar una entrada de un tipo y obtener una salida de otro tipo
    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> results = new ArrayList<>();

        for (T item: list){
            R result = function.apply(item);
            results.add(result);
        }
        return results;
    }
}
