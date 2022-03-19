package com.example.stream.examples.sales;

import com.example.domain.Sale;

import java.util.List;

import static com.example.utils.DataUtils.getSales;
import static java.util.Comparator.comparing;

/**
 * Hay algún customer cuya ciudad sea Milan
 */
public class Example5 {

    public static void main(String[] args) {

        List<Sale> sales = getSales();
        sales.stream().filter(sale -> sale.getCustomer().getCity().equals("Milan"))
                .map(sale -> sale.getCustomer().getName()).findAny().ifPresent(System.out::println);
    }
}
