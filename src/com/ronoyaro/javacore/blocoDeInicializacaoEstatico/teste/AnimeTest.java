package com.ronoyaro.javacore.blocoDeInicializacaoEstatico.teste;


import com.ronoyaro.javacore.blocoDeInicializacaoEstatico.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime anime1 = new Anime("Haikyuu");
        Anime anime2 = new Anime("Dragon Ball Z");
    }
}
