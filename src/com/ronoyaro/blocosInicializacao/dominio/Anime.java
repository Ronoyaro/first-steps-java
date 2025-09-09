package com.ronoyaro.blocosInicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    //1 - alocado espaco em memoria pro objeto
    //2 - cada atributo de classe eh criado e inicializado, default ou valor passado
    //3 - executa o bloco de inicializacao
    //4 - executa o construtor

    {
        System.out.println("Dentro do bloco de inicializacao");
        this.episodios = new int[100];
        for (int i = 0; i < this.episodios.length; i++) {
            this.episodios[i] = i+1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }
    public Anime(){
        for (int episodio: this.episodios){
            System.out.print(episodio + " ");
        }
    }
    public int[] getEpisodio(){
        return this.episodios;
    }

}
