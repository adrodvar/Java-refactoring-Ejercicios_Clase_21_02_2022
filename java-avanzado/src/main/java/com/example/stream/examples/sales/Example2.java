package com.example.stream.examples.sales;

import com.example.domain.Sale;

import java.util.List;

import static com.example.utils.DataUtils.getSales;

/**
 * A partir de las sales encuentra todas las ciudades únicas en las que habitan
 * los customers
 */
public class Example2 {

    public static void main(String[] args) {
        List<Sale> sales = getSales();
        sales.stream().map(sale -> sale.getCustomer().getCity()).distinct().forEach(System.out::println);
    }
}
