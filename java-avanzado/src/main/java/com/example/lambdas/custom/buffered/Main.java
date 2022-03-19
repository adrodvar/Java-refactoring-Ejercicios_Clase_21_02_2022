package com.example.lambdas.custom.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;
/**
 *
 * (parameters) -> expression
 *
 * (parameters) -> { statements; };
 */
public class Main {

    public static void main(String[] args) throws IOException {



        String result = processFile(br -> br.readLine() + br.readLine());
        System.out.println(result);

        String result2 = processFile(br -> br.lines().collect(Collectors.joining()));
        System.out.println(result2);

        String result3 = processFile(br -> br.lines().collect(Collectors.joining(System.lineSeparator())));
        System.out.println(result3);

        String result4 = processFile(br -> {
            String text = br.readLine() + br.readLine();
            System.out.println(text);
            return text;
        });
        System.out.println(result4);

    }

    public static String processFile(BufferedReaderProcessor b) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("C:/dev/data.txt"))) {
            return b.process(br);
        }
    }
}
