package com.ronoyaro.javacore.streams.test;

import com.ronoyaro.javacore.streams.dominio.Category;
import com.ronoyaro.javacore.streams.dominio.LightNovel;
import com.ronoyaro.javacore.streams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest14 {
    public static void main(String[] args) {
        List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Dororo", 8.99, Category.FANTASY),
                new LightNovel("No Game No Life", 2.99, Category.DRAMA),
                new LightNovel("Full Metal Alchimiest", 1.99, Category.ROMANCE),
                new LightNovel("Kumo desu ga", 3.99, Category.DRAMA),
                new LightNovel("Dororo", 2.50, Category.ROMANCE),
                new LightNovel("Sword Art Online", 7.99, Category.DRAMA),
                new LightNovel("Konosuba", 2.79, Category.FANTASY)));

        Map<Promotion, Map<Category, List<LightNovel>>> lightNovelsByPrice = lightNovels.stream()
                .collect(Collectors.groupingBy(ln -> ln.getPrice() < 4 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE, Collectors.groupingBy(LightNovel::getCategory)));

        System.out.println(lightNovelsByPrice);
    }
}
