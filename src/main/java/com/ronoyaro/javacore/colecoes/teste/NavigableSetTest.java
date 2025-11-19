package com.ronoyaro.javacore.colecoes.teste;

import com.ronoyaro.javacore.colecoes.dominio.Manga;
import com.ronoyaro.javacore.colecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaTituloComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getTitulo().compareTo(o2.getTitulo());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest {
    public static void main(String[] args) {
        NavigableSet<Smartphone> smartphones = new TreeSet<>(new SmartphoneMarcaComparator());
        smartphones.add(new Smartphone("2225", "Xiamoi"));
//        System.out.println(smartphones);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(3L, "Berserk", 15.90, 5));
        mangas.add(new Manga(4L, "Naruto", 20.90, 0));
        mangas.add(new Manga(2L, "One Piece", 22.50, 2));
        mangas.add(new Manga(1L, "Konosuba", 17.90, 0));

        for (Manga manga: mangas) {
            System.out.println(manga);
        }
        System.out.println("-----------------");
        System.out.println(mangas.lower(new Manga(27L, "Yuyu Hakusho", 20.90, 5)));
        System.out.println(mangas.floor(new Manga(27L, "Yuyu Hakusho", 20.90, 5)));
        System.out.println(mangas.higher(new Manga(27L, "Yuyu Hakusho", 20.90, 5)));
        System.out.println(mangas.ceiling(new Manga(27L, "Yuyu Hakusho", 20.90, 5)));
        System.out.println("--------------------------");

        System.out.println(mangas.pollFirst());
        System.out.println(mangas.pollLast());
    }
}
