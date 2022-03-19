package com.example.collections;

import com.example.domain.Sale;
import com.example.utils.DataUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * remove sales that have a reference code starting with a digit
 */
public class RemoveIf {

    public static void main(String[] args) {

        List<Sale> sales = new ArrayList<>(DataUtils.getSales());
        sales.forEach(System.out::println);

        // aplicar borrado con removeIf
        sales.removeIf(s -> Character.isDigit(s.getReferenceCode().charAt(0)));
        System.out.println("\nDespués de borrar:");
        sales.forEach(System.out::println);

    }
}
