package com.example.stream.examples.sales;

import com.example.domain.Sale;

import java.util.Arrays;
import java.util.List;

import static com.example.utils.DataUtils.getSales;
import static java.util.Comparator.comparing;

/**
 * Imprimir todos los valores de las ventas asociadas a cada Customer
 * que viva en la ciudad Cambridge
 */
public class Example6 {

    public static void main(String[] args) {

        List<Sale> sales = getSales();
        sales.stream().filter(sale -> sale.getCustomer().getCity().equals("Cambridge")).distinct()
                .flatMap(sale -> getSales().stream()).map(sale -> sale.getValue())
                .forEach(System.out::println);
    }
}
