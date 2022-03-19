package com.example.stream.opterminales.match;

import com.example.domain.Product;

import java.util.List;

import static com.example.utils.DataUtils.getProducts;

/**
 * En cuanto se encuentra un elemento, se puede producir un resultado.
 *
 * A esto se le llama short-circuiting, no es necesario procesar el stream entero.
 */
public class AnyMatch {

    public static void main(String[] args) {

        List<Product> products = getProducts();

        if(products.stream().anyMatch(Product::isDiscount)) {
            System.out.println("The shopcart has a discounted product!");
        }
    }
}
