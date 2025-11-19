package com.ronoyaro.javacore.streams.test;

import com.ronoyaro.javacore.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    public static void main(String[] args) {
        List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Dororo", 8.99),
                new LightNovel("No Game No Life", 2.99),
                new LightNovel("Full Metal Alchimiest", 1.99),
                new LightNovel("Kumo desu ga", 3.99),
                new LightNovel("Dororo", 2.50),
                new LightNovel("Sword Art Online", 7.99),
                new LightNovel("Konosuba", 2.79)));

        double soma = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(novels -> novels >= 4)
                .sum();

        System.out.println(soma);


    }
}
