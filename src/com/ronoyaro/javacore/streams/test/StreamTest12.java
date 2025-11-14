package com.ronoyaro.javacore.streams.test;

import com.ronoyaro.javacore.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest12 {
    public static void main(String[] args) {
        List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Dororo", 8.99),
                new LightNovel("No Game No Life", 2.99),
                new LightNovel("Full Metal Alchimiest", 1.99),
                new LightNovel("Kumo desu ga", 3.99),
                new LightNovel("Dororo", 2.50),
                new LightNovel("Sword Art Online", 7.99),
                new LightNovel("Konosuba", 2.79)));

        DoubleSummaryStatistics statistics = lightNovels.stream()
                .collect(Collectors.summarizingDouble(LightNovel::getPrice));

        DoubleSummaryStatistics statisticsMoreThanFourth = lightNovels.stream()
                .filter(ln -> ln.getPrice() > 4)
                .collect(Collectors.summarizingDouble(LightNovel::getPrice));

        System.out.println(statisticsMoreThanFourth.getCount());

        String titles = lightNovels.stream()
                .map(LightNovel::getTitle)
                .collect(Collectors.joining(", "));

        System.out.println(titles);
    }
}
