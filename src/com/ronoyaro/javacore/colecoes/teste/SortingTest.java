package com.ronoyaro.javacore.colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingTest {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);

        mangas.add("One Piece");
        mangas.add("Dragon Ball Z");
        mangas.add("Shingeki no Kyojin");
        mangas.add("Berserk");

        Collections.sort(mangas);

        for(String manga: mangas) {
            System.out.println(manga);
        }
    }
}
