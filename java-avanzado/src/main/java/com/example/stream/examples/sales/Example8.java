package com.example.stream.examples.sales;

import com.example.domain.Sale;
import com.example.utils.DataUtils;

import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;

/**
 * Encontrar la sale con el valor más pequeño
 */
public class Example8 {

    public static void main(String[] args) {

        List<Sale> sales = DataUtils.getSales();
        Optional<Integer> i= sales.stream().map(sale -> sale.getValue()).min(Integer::compareTo);
        //forEach(System.out::println);
        System.out.println(i.get());
    }
}
