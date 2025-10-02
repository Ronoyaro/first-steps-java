package com.ronoyaro.javacore.orientacaoObjetos.sobrescritaToString.teste;

import com.ronoyaro.javacore.orientacaoObjetos.sobrescritaToString.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setNome("Berserk");
        anime.setIdade(25);

        System.out.println(anime);
    }
}
