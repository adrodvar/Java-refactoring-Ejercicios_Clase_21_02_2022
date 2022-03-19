package com.example.stream.creation;

import java.util.Arrays;

public class StreamArrays {

    public static void main(String[] args) {

        int[] numbers = {2, 3, 5, 7, 11, 13};
        int sum = Arrays.stream(numbers).sum();
        System.out.println(sum);
    }
}
