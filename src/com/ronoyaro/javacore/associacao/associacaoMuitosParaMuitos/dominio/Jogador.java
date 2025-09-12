package com.ronoyaro.javacore.associacao.associacaoMuitosParaMuitos.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.time.getNome());
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTime(Time time) {
        this.time = time;
    }


}
