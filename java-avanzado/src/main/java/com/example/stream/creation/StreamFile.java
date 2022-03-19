package com.example.stream.creation;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFile {

    public static void main(String[] args) throws IOException {

        long uniqueWords = 0;
        try (Stream<String> lines = Files.lines(Paths.get("C:/dev/data.txt"), Charset.defaultCharset())) {
            uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" ")))
                    .distinct()
                    .count();
        }
        System.out.println(uniqueWords);
    }
}
