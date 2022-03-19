package com.example.stream.opintermedias;

import com.example.domain.Product;

import java.util.List;

import static com.example.utils.DataUtils.getProducts;

/**
 * select and skip elements in a stream
 */
public class TakeWhile {

    public static void main(String[] args) {
        List<Product> products = getProducts();

//        List<Product> filteredProducts = products.stream()
//                .filter(p -> {
//                    System.out.println("checking price: " + p.getPrice());
//                    return p.getPrice() < 30;
//                })
//                .toList();
//
//        System.out.println(filteredProducts);

        // takeWhile permite dejar de buscar cuando se ha terminado de cumplir la condición,
        // equivale al break de los bucles tradicionales
//        List<Product> filteredProducts2 = products.stream()
//                .takeWhile(p -> {
//                    System.out.println("checking price: " + p.getPrice());
//                    return p.getPrice() < 30;
//                })
//                .toList();
//
//        System.out.println(filteredProducts2);

        // inversa de takeWhile
        List<Product> filteredProducts3 = products.stream()
                .dropWhile(p -> {
                    System.out.println("checking price: " + p.getPrice());
                    return p.getPrice() < 30;
                })
                .toList();

        System.out.println(filteredProducts3);

    }
}
