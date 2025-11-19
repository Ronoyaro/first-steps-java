package com.ronoyaro.javacore.streams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> nomes = new ArrayList<>();
        List<String> mans = List.of("Ronald", "Gustavo", "Alberto", "Luiz", "Carlos");
        List<String> womans = List.of("Carla", "Marcela", "Jessica", "Augustina");
        nomes.add(mans);
        nomes.add(womans);
       nomes.stream()
               .flatMap(Collection::stream)
               .forEach(System.out::println);

    }
}
