package com.example.stream.opterminales.match;

import com.example.domain.Product;

import java.util.List;

import static com.example.utils.DataUtils.getProducts;

public class NoneMatch {

    public static void main(String[] args) {

        List<Product> products = getProducts();

        boolean expensiveProducts = products.stream()
                .noneMatch(p -> p.getPrice() < 500);

        System.out.println(expensiveProducts);
    }
}
