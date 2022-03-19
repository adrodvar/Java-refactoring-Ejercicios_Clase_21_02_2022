package com.example.stream.examples.sales;

import com.example.domain.Sale;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.example.utils.DataUtils.getSales;
import static java.util.Comparator.comparing;

/**
 * Encuentra todas las sales del año 2021 y ordénalas por valor (más pequeño a más alto)
 */
public class Example1 {

    public static void main(String[] args) {


       List<Sale> sales = getSales();
        sales.stream().filter(sale -> sale.getYear() == 2021).sorted( comparing(sale -> sale.getValue())).forEach(System.out::println);}
}
