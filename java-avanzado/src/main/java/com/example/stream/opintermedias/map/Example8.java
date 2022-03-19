package com.example.stream.opintermedias.map;

import java.util.Arrays;
import java.util.List;


/**
 * map() vs. flatMap()
 *
 * map(): la operación map() se usa cuando tenemos un flujo de objetos,
 * y necesitamos obtener algún valor único para cada elemento del flujo.
 * Hay un mapeo uno a uno (one-to-one) entre el elemento de entrada y el de salida.
 * Por ejemplo, podemos escribir un programa para encontrar la fecha de
 * nacimiento de todos los empleados en un flujo de empleados.
 *
 * flatMap(): se crea un mapeo de uno a muchos (one-to-many) donde para cada
 * elemento/flujo de entrada, primero obtenemos un valor múltiple y
 * luego aplanamos los valores de todos esos flujos de entrada en un
 * único flujo de salida. Por ejemplo, podemos escribir un programa
 * para encontrar todas las palabras del distrito de todas las líneas
 * de un archivo de texto.
 */
public class Example8 {

    public static void main(String[] args) {

        // Ejemplo 1: map()

        List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");

        List<Integer> listOfIntegers = listOfStrings.stream()
                .map(Integer::valueOf)
                .toList();

        System.out.println(listOfIntegers);     //[1, 2, 3, 4, 5]


        // Ejemplo 2: flatMap() = map() + flattening
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);

        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);

        listOfLists.stream()
                .flatMap(x -> x.stream())
                .map(x -> x + 2)
                .toList();
        List<Integer> listOfAllIntegers = listOfLists.stream()
                .flatMap(x -> x.stream())
                .toList();

        System.out.println(listOfAllIntegers);      //[1, 2, 3, 4, 5, 6, 7, 8, 9]

    }
}
