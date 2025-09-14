package com.ronoyaro.javacore.sobrescritaToString.teste;

import com.ronoyaro.javacore.sobrescritaToString.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setNome("Berserk");
        anime.setIdade(25);

        System.out.println(anime);
    }
}
