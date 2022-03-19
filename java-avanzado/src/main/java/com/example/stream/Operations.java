package com.example.stream;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Ejemplos de operaciones con streams: map, filter, sorted, collect, reduce
 */
public class Operations {

    public static void main(String[] args) {

        // demonstration of map method
        List<Integer> number = Arrays.asList(2,3,4,5);
        List<Integer> square = number.stream()
                .map(x -> x*x)
                .collect(Collectors.toList());
        System.out.println(square);

        // demonstration 1 of filter method
        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        List<String> result = names.stream()
                .filter(s->s.startsWith("S"))
                .collect(Collectors.toList());
        System.out.println(result);

        // demonstration 2 of filter method
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = nums.stream().
                filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);  // [2, 4, 6]

        // demonstration of sorted method
        List<String> show = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(show);


        // collect method returns a set
        List<Integer> numbers = Arrays.asList(2,3,4,5,2);
        Set<Integer> squareSet = numbers.stream()
                .map(x->x*x)
                .collect(Collectors.toSet());
        System.out.println(squareSet);

        // demonstration of forEach method
        number.stream()
                .map(x->x*x)
                .forEach(y->System.out.println(y));

        // demonstration of reduce method
        int even = number.stream()
                .filter(x->x%2==0)
                .reduce(0,(ans,i)-> ans+i);

        System.out.println(even);
    }
}
