package com.example.stream.opintermedias.map;

import com.example.domain.Product;

import java.util.List;

import static com.example.utils.DataUtils.getProducts;

public class Example4 {

    public static void main(String[] args) {

        List<Product> products = getProducts();

        List<Integer> productNameLengths = products.stream()
                .map(Product::getName)
                .map(String::length)
                .toList();

        System.out.println(productNameLengths);

    }
}
