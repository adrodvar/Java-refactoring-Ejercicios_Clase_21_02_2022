package com.example.lambdas.interfacesfuncionales.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main3 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("name1", "name2", "", "name3", "name4", "");

        List<String> filteredNames = filter(names, name -> !name.isEmpty());
        System.out.println(filteredNames);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){

        List<T> filtered = new ArrayList<>();

        for(T item : list){
            if (predicate.test(item))
                filtered.add(item);
        }
        return filtered;

    }
}
