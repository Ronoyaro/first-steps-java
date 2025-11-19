package com.ronoyaro.javacore.streams.test;


import com.ronoyaro.javacore.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class StreamTest02 {
    public static void main(String[] args) {
        List<LightNovel> lightNovels = new ArrayList(List.of(new LightNovel("Dororo", 8.99),
                new LightNovel("No Game No Life", 2.99),
                new LightNovel("Full Metal Alchimiest", 1.99),
                new LightNovel("Kumo desu ga", 3.99),
                new LightNovel("Dororo", 2.50),
                new LightNovel("Sword Art Online", 7.99),
                new LightNovel("Konosuba", 2.79)));

        Consumer<LightNovel> printLn = System.out::println;

        Function<LightNovel, String> titleList = (l) -> l.getTitle();

        List<String> LightNovelsList = lightNovels
                .stream()
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .filter(l -> l.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .toList();
        System.out.println(LightNovelsList);
    }


}
