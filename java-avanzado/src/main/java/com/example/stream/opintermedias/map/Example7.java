package com.example.stream.opintermedias.map;

import com.example.domain.Bike;

import java.util.Arrays;
import java.util.List;

public class Example7 {

    public static void main(String[] args) {

        List<String> bikeNames = Arrays.asList("Orbea", "Monty", "Trek", "GT");

        List<Bike> bikes = bikeNames.stream()
                .map(name -> new Bike(name))
                .toList();

        System.out.println(bikes);


        bikes = bikeNames.stream()
                .map(Bike::new)
                .toList();

        System.out.println(bikes);
    }
}
