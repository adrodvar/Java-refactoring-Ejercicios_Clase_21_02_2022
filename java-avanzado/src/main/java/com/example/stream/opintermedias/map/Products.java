package com.example.stream.opintermedias.map;

import com.example.domain.Product;

import java.util.List;

import static com.example.utils.DataUtils.getProducts;

public class Products {

    public static void main(String[] args) {

        List<Product> products = getProducts();

        Double precioTotal = products.stream()
                .map(Product::getPrice)
                .reduce(Double::sum).orElse(0d);

        System.out.println(precioTotal);

        String[] nameLengths = products.stream().map(Product::getName).toArray(String[]::new);

        String[] nameLengths2 = products.stream()
                .map(Product::getName)
                .toArray(size -> new String[size]);


        double[] prices = products.stream().mapToDouble(Product::getPrice).toArray();

    }
}
