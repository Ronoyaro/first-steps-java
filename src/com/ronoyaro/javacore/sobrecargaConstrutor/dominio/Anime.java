package com.ronoyaro.javacore.sobrecargaConstrutor.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;

    public Anime(String nome, String tipo){
        //Obrigatorio passar o this(); como primeiro no corpo da chamada do construtor
        this();
        this.nome = nome;
        this.tipo = tipo;
    }
    public Anime(String nome, String tipo, int episodios){
        this(nome, tipo);
        this.episodios = episodios;
    }
    public Anime(){
        System.out.println("Objeto construido");
    }
}
