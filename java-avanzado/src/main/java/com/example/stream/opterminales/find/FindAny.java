package com.example.stream.opterminales.find;

import com.example.domain.Product;

import java.util.List;
import java.util.Optional;

import static com.example.utils.DataUtils.getProducts;

public class FindAny {

    public static void main(String[] args) {

        List<Product> products = getProducts();

        Optional<Product> product = products.stream()
                .filter(Product::isDiscount)
                .findAny();

        products.stream()
                .filter(Product::isDiscount)
                .findAny()
                .ifPresent(p -> System.out.println(p.getName()));
    }
}
