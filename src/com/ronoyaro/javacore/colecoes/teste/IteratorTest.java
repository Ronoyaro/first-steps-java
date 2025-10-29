package com.ronoyaro.javacore.colecoes.teste;

import com.ronoyaro.javacore.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(3L, "Berserk", 20.90, 5));
        mangas.add(new Manga(4L, "Naruto", 20.90, 0));
        mangas.add(new Manga(2L, "One Piece", 20.90, 2));
        mangas.add(new Manga(1L, "Konosuba", 20.90, 0));

//        Iterator<Manga> iteratorManga = mangas.iterator();
//        while(iteratorManga.hasNext()) {
//            Manga nextManga = iteratorManga.next();
//            if(nextManga.getQuantidade() == 0) {
//                iteratorManga.remove();
//            }
//        }
//        System.out.println(mangas);

        mangas.removeIf(m -> m.getQuantidade() == 0);
        System.out.println(mangas);


    }
}
