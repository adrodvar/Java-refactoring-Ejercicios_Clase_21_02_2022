package com.example.stream.examples.sales;

import com.example.domain.Sale;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

import static com.example.utils.DataUtils.getSales;
import static java.util.Comparator.comparing;

/**
 * Returns a string of all employees names sorted alphabetically
 * Devuelve un String que tenga todos los nombres de los empleados ordenados alfabéticamente
 *
 * Nota: el resultado debe ser una variable String
 */
public class Example4 {

    public static void main(String[] args) {
        List<Sale> sales = getSales();
        sales.stream().filter(sale -> sale.getCustomer().getCity().equals("Cambridge"))
                .sorted(comparing(sale -> sale.getCustomer().getName()))
                .map(sale -> sale.getCustomer().getName())
                .distinct()
                .forEach(System.out::println);

    }
}
