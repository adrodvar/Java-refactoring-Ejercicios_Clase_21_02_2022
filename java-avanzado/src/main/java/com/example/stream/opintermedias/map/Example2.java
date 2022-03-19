package com.example.stream.opintermedias.map;

import com.example.domain.Product;

import java.util.List;

import static com.example.utils.DataUtils.getProducts;

public class Example2 {

    public static void main(String[] args) {

        List<Product> products = getProducts();

        List<String> productNames = products.stream()
                .map(Product::getName)
                .toList();

        System.out.println(productNames);

    }
}
