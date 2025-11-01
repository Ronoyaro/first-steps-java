package com.ronoyaro.javacore.colecoes.teste;

import com.ronoyaro.javacore.colecoes.dominio.Consumidor;
import com.ronoyaro.javacore.colecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {

    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Ronald");
        Consumidor consumidor2 = new Consumidor("Bruno");

        Manga manga1 = new Manga(27L, "Berserk", 9.90);
        Manga manga2 = new Manga(56L, "Yuyu Hakusho", 25.90);
        Manga manga3 = new Manga(76L, "Pokemon", 25.90);
        Manga manga4 = new Manga(9L, "Madoka Magica", 9.90);
        Manga manga5 = new Manga(7L, "Digimon", 24, 50);

        List<Manga> mangasA = List.of(manga1, manga2, manga3);
        List<Manga> mangasB = List.of(manga4, manga5);

        Map<Consumidor, List<Manga>> consumidorListMap = new HashMap<>();
        consumidorListMap.put(consumidor1, mangasB);
        consumidorListMap.put(consumidor2, mangasA);

        for(Map.Entry<Consumidor, List<Manga>> entry: consumidorListMap.entrySet()) {
            System.out.println("-----User: "+entry.getKey().getNome());
            System.out.println("---Items:");
            for(Manga manga: entry.getValue()) {
                System.out.println("---------"+manga);
            }
        }
    }
}
