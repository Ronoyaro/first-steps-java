package com.ronoyaro.javacore.streams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            lines.filter(line -> line.contains("Java"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
