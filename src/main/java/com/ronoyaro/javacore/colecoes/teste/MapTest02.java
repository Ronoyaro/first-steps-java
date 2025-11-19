package com.ronoyaro.javacore.colecoes.teste;

import com.ronoyaro.javacore.colecoes.dominio.Consumidor;
import com.ronoyaro.javacore.colecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("Ronald");
        Consumidor consumidor2 = new Consumidor("Bruno");

        Manga manga1 = new Manga(27L, "Berserk", 9.90);
        Manga manga2 = new Manga(56L, "Yuyu Hakusho", 25.90);

        Map<Consumidor, Manga> clientesManga = new HashMap<>();

        clientesManga.put(consumidor1, manga2);
        clientesManga.put(consumidor2, manga1);

        for(Map.Entry<Consumidor, Manga> entry: clientesManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + ": " +entry.getValue().getTitulo());
        }


    }
}
