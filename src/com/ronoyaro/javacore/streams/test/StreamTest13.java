package com.ronoyaro.javacore.streams.test;

import com.ronoyaro.javacore.streams.dominio.Category;
import com.ronoyaro.javacore.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
    public static void main(String[] args) {
        List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Dororo", 8.99, Category.FANTASY),
                new LightNovel("No Game No Life", 2.99, Category.DRAMA),
                new LightNovel("Full Metal Alchimiest", 1.99, Category.ROMANCE),
                new LightNovel("Kumo desu ga", 3.99, Category.DRAMA),
                new LightNovel("Dororo", 2.50, Category.ROMANCE),
                new LightNovel("Sword Art Online", 7.99, Category.DRAMA),
                new LightNovel("Konosuba", 2.79, Category.FANTASY)));

        Map<Category, List<LightNovel>> categoryListMap = new HashMap<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()) {
                case DRAMA -> drama.add(lightNovel);
                case FANTASY -> fantasy.add(lightNovel);
                case ROMANCE -> romance.add(lightNovel);
            }
        }
        categoryListMap.put(Category.FANTASY, fantasy);
        categoryListMap.put(Category.DRAMA, drama);
        categoryListMap.put(Category.ROMANCE, romance);

        for (Map.Entry<Category, List<LightNovel>> listMap : categoryListMap.entrySet()) {
            System.out.println(listMap.getKey() + ": " + listMap.getValue());
        }
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        Map<Category, List<LightNovel>> lightNovelsByCategory = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory));

        for (Map.Entry<Category, List<LightNovel>> categoryListEntry : lightNovelsByCategory.entrySet()) {
            System.out.println(categoryListEntry.getKey() + ": " + categoryListEntry.getValue());
        }


    }
}
