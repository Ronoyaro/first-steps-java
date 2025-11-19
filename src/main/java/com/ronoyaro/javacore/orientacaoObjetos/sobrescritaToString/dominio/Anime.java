package com.ronoyaro.javacore.orientacaoObjetos.sobrescritaToString.dominio;

public class Anime {
    private String nome;
    private int episodios;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return episodios;
    }

    public void setIdade(int episodios) {
        this.episodios = episodios;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                ", episodios=" + episodios +
                '}';
    }
}
