package com.ronoyaro.javacore.colecoes.teste;

import com.ronoyaro.javacore.colecoes.dominio.Manga;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class compareByTitulo implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
       return manga1.getTitulo().compareTo(manga2.getTitulo());
    }
}

public class SortingTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(23L, "Berserk", 9.99));
        mangas.add(new Manga(2L, "Attack on Titan", 27.90));
        mangas.add(new Manga(10L, "Death Note", 24.90));
        mangas.add(new Manga(6L, "Vagabond", 15.90));

        Collections.sort(mangas);

        for(Manga manga: mangas) {
            System.out.println(manga);
        }
        System.out.println("------------Ordenado pelo Titulo-----------");
//        Collections.sort(mangas, new compareByTitulo());
        mangas.sort(new compareByTitulo());
        for (Manga manga: mangas) {
            System.out.println(manga);
        }

    }

}
