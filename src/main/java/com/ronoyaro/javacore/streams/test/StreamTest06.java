package com.ronoyaro.javacore.streams.test;

import com.ronoyaro.javacore.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    public static void main(String[] args) {
        List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Dororo", 8.99),
                new LightNovel("No Game No Life", 2.99),
                new LightNovel("Full Metal Alchimiest", 1.99),
                new LightNovel("Kumo desu ga", 3.99),
                new LightNovel("Dororo", 2.50),
                new LightNovel("Sword Art Online", 7.99),
                new LightNovel("Konosuba", 2.79)));

        boolean b1 = lightNovels.stream()
                .anyMatch(ln -> ln.getPrice() >= 4);

        boolean b2 = lightNovels.stream()
                .allMatch(ln -> ln.getPrice() >= 1.99);
        boolean b3 = lightNovels.stream()
                .noneMatch(ln -> ln.getPrice() >= 10);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() >= 2)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }

}
