package com.example.stream.opintermedias;

import com.example.domain.Product;

import java.util.List;

import static com.example.utils.DataUtils.getProducts;

public class Limit {

    public static void main(String[] args) {
        List<Product> products = getProducts();

        List<Product> filteredProducts = products.stream()
                .filter(p -> p.getPrice() < 30)
                .limit(2)
                .toList();

        System.out.println(filteredProducts);
    }
}
