package com.ronoyaro.javacore.blocosInicializacao.blocoDeInicializacaoEstatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    //0 - executa o bloco de inicializacao estatico apenas 1x pra economizar poder de processamento
    //1 - alocado espaco em memoria pro objeto
    //2 - cada atributo de classe eh criado e inicializado, default ou valor passado
    //3 - executa o bloco de inicializacao
    //4 - executa o construtor

    static {
        System.out.println("Dentro do bloco de inicializacao");
        Anime.episodios = new int[100];
        for (int i = 0; i < Anime.episodios.length; i++) {
            Anime.episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
    }

    public int[] getEpisodio() {
        return Anime.episodios;
    }

}
