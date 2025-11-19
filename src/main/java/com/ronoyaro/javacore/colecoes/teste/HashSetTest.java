package com.ronoyaro.javacore.colecoes.teste;

import com.ronoyaro.javacore.colecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(7L, "Berserk", 25.90, 9));
        mangas.add(new Manga(8L, "Boku no Hero", 12.50, 6));
        mangas.add(new Manga(1L, "Vinland Saga", 9.50, 2));
        mangas.add(new Manga(3L, "Erased", 11.30, 3));
        mangas.add(new Manga(2L, "Dragon Ball Z", 11.30, 8));

        for (Manga manga: mangas) {
            System.out.println(manga);
        }
    }
}
