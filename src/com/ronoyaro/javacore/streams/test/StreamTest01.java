package com.ronoyaro.javacore.streams.test;

import com.ronoyaro.javacore.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    public static void main(String[] args) {
        List<LightNovel> lightNovels = new ArrayList(List.of(new LightNovel("Dororo", 8.99),
                new LightNovel("No Game No Life", 2.99),
                new LightNovel("Full Metal Alchimiest", 1.99),
                new LightNovel("Kumo desu ga", 3.99),
                new LightNovel("Dororo", 2.50),
                new LightNovel("Sword Art Online", 7.99),
                new LightNovel("Konosuba", 2.79)));

        List<String> newListNovels = new ArrayList<>();
        Collections.sort(lightNovels, (l1, l2) -> Double.compare(l1.getPrice(), l2.getPrice()));
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                newListNovels.add(lightNovel.getTitle());
            }
            if(newListNovels.size() >= 3){
                break;
            }
        }
        System.out.println(newListNovels);
        Comparator<LightNovel> comparing = Comparator.comparing(LightNovel::getPrice);
        Comparator<LightNovel> comparing2 = Comparator.comparing(l -> l.getPrice());

        lightNovels.sort(comparing);

    }
}
