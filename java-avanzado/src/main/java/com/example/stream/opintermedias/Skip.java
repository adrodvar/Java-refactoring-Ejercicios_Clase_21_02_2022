package com.example.stream.opintermedias;

import com.example.domain.Product;

import java.util.List;

import static com.example.utils.DataUtils.getProducts;

public class Skip {

    public static void main(String[] args) {
        List<Product> products = getProducts();

        List<Product> filteredProducts = products.stream()
                .filter(p -> p.getPrice() > 30)
                .toList();

        System.out.println(filteredProducts);

        System.out.println("================");


        // skip
        List<Product> filteredProducts2 = products.stream()
                .filter(p -> p.getPrice() > 30)
                .skip(2)
                .toList();

        System.out.println(filteredProducts2);
    }
}
