package com.ronoyaro.javacore.streams.test;

import com.ronoyaro.javacore.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    public static void main(String[] args) {
        List<LightNovel> lightNovels = new ArrayList(List.of(new LightNovel("Dororo", 8.99),
                new LightNovel("No Game No Life", 2.99),
                new LightNovel("Full Metal Alchimiest", 1.99),
                new LightNovel("Kumo desu ga", 3.99),
                new LightNovel("Dororo", 2.50),
                new LightNovel("Sword Art Online", 7.99),
                new LightNovel("Konosuba", 2.79),
                new LightNovel("Konosuba", 2.90)));

        Stream<LightNovel> stream = lightNovels.stream();
        long count = stream
                .filter(ln -> ln.getPrice() <= 4)
                .count();
        System.out.println(count);

        long count1 = lightNovels.stream()
                .distinct()
                .filter(ln -> ln.getTitle().contains("Konosuba"))
                .count();
        System.out.println(count1);

    }


}
