package com.example.lambdas.custom.converter;

@FunctionalInterface
public interface Converter<T, Z, R> {
    R convert(T from1, Z from2);
}
