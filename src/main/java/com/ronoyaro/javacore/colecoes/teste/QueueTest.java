package com.ronoyaro.javacore.colecoes.teste;

import com.ronoyaro.javacore.colecoes.dominio.Manga;

import java.util.Comparator;

import java.util.PriorityQueue;
import java.util.Queue;


class CompareMangaByPrice implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getPreco().compareTo(o2.getPreco());
    }
}

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");
        fila.offer("D");

        fila.poll(); //retorna o primeiro da fila

        while(!fila.isEmpty()){
            System.out.println(fila.poll());
        }

        Queue<Manga> mangas = new PriorityQueue<>(new CompareMangaByPrice().reversed());
        Manga manga1 = new Manga(30L, "Berserk", 20.90, 10);
        Manga manga2 = new Manga(25L, "Boku no Hero", 25.30, 8);
        Manga manga3 = new Manga(18L, "Yuyu Hakusho", 13.90, 13);

        mangas.add(manga1);
        mangas.add(manga2);
        mangas.add(manga3);

      while(!mangas.isEmpty()) {
          System.out.println(mangas.poll());
      }
    }
}
