package com.example.utils;

import com.example.domain.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DataUtils {

    public static Stream<String> filePathToStream(String path) {
        try {
            return Files.lines(Paths.get("training", path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static IntStream range(int start, int end) {
        return IntStream.rangeClosed(start, end);
    }

    public static List<Task> getTasks() {
        Task task1 = new Task("Example of task", TaskType.READING, LocalDate.of(2015, Month.SEPTEMBER, 20)).addTag("java").addTag("java8").addTag("books");
        Task task2 = new Task("Write factorial program in Haskell", TaskType.CODING, LocalDate.of(2015, Month.SEPTEMBER, 20)).addTag("program").addTag("haskell").addTag("functional");
        Task task3 = new Task("Read Effective Java", TaskType.READING, LocalDate.of(2015, Month.SEPTEMBER, 21)).addTag("java").addTag("books");
        Task task4 = new Task("Write a blog on Stream API", TaskType.BLOGGING, LocalDate.of(2015, Month.SEPTEMBER, 21)).addTag("writing").addTag("stream").addTag("java8");
        Task task5 = new Task("Write prime number program in Scala", TaskType.CODING, LocalDate.of(2015, Month.SEPTEMBER, 22)).addTag("scala").addTag("functional").addTag("program");
        return Stream.of(task1, task2, task3, task4, task5).collect(toList());
    }

    public static List<Product> getProducts() {

        Product prod1 = new Product("1234567891", "product 1", 14.99, true);
        Product prod2 = new Product("1234567892", "product 2", 24.99, true);
        Product prod3 = new Product("1234567893", "product 3", 44.99, false);
        Product prod4 = new Product("1234567894", "product 4", 54.99, true);
        Product prod5 = new Product("1234567895", "product 5", 64.99, false);
        Product prod6 = new Product("1234567896", "product 6", 74.99, true);
        Product prod7 = new Product("1234567897", "product 7", 84.99, true);
        Product prod8 = new Product("1234567898", "product 8", 94.99, false);

        return Stream.of(prod1, prod2, prod3, prod4, prod5, prod6, prod7, prod8).toList();
    }

    public static List<Sale> getSales(){

        Customer raoul = new Customer("Raoul", "Cambridge");
        Customer mario = new Customer("Mario","Milan");
        Customer alan = new Customer("Alan","Cambridge");
        Customer brian = new Customer("Brian","Cambridge");
        return Arrays.asList(
                new Sale(brian, 2021, 300, "12345678"),
                new Sale(raoul, 2012, 1000, "erTyHGfB"),
                new Sale(raoul, 2021, 400, "FGtYYyUjH"),
                new Sale(raoul, 2021, 500, "6654gH645"),
                new Sale(mario, 2012, 710, "dFRE345GF"),
                new Sale(mario, 2012, 700, "222343gfG"),
                new Sale(alan, 2012, 950, "TYUu55646")
        );

    }
}

