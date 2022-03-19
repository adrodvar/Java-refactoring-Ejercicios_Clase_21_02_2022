package com.example.stream.examples.sales;

import com.example.domain.Sale;
import com.example.utils.DataUtils;

import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;

/**
 * Cuál es el valor más alto de todas las sales
 */
public class Example7 {

    public static void main(String[] args) {

        List<Sale> sales = DataUtils.getSales();
        Optional<Integer> i= sales.stream().map(sale -> sale.getValue()).max(Integer::compareTo);
                //forEach(System.out::println);
        System.out.println(i.get());
    }
}
