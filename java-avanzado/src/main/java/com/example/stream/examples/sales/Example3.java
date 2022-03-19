package com.example.stream.examples.sales;

import com.example.domain.Sale;

import java.util.List;

import static com.example.utils.DataUtils.getSales;
import static java.util.Comparator.comparing;

/**
 * Encuentra todos los clientes de Cambridge y ordénalos por nombre
 */
public class Example3 {

    public static void main(String[] args) {

        List<Sale> sales = getSales();
        sales.stream().filter(sale -> sale.getCustomer().getCity().equals("Cambridge"))
                .sorted(comparing(sale -> sale.getCustomer().getName()))
                .map(sale -> sale.getCustomer().getName())
                .distinct()
                .forEach(System.out::println);
    }
}
