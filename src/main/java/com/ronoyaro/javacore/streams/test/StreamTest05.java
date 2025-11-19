package com.ronoyaro.javacore.streams.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> mans = List.of("Ronald", "Gustavo", "Alberto", "Luiz", "Carlos");
        List<String> list = mans.stream()
                .map(n -> n.split(""))
                .flatMap(n -> Arrays.stream(n))
                .toList();

        System.out.println(list);
    }

}
