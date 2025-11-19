package com.ronoyaro.javacore.colecoes.teste;

import com.ronoyaro.javacore.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
        compareByTitulo compareByTitulo = new compareByTitulo();

        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(7L, "Berserk", 25.90));
        mangas.add(new Manga(8L, "Boku no Hero", 12.50));
        mangas.add(new Manga(6L, "Vinland Saga", 9.50));
        mangas.add(new Manga(6L, "Erased", 11.30));

        mangas.sort(compareByTitulo);
        for(Manga manga: mangas) {
            System.out.println(manga);
        }
        Manga bokuNoHero = new Manga(8L, "Boku no Hero", 12.50);

        int indexManga = Collections.binarySearch(mangas, bokuNoHero, compareByTitulo);

        System.out.println(indexManga);
    }
}
