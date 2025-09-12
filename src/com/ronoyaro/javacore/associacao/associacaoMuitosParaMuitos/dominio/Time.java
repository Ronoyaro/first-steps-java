package com.ronoyaro.javacore.associacao.associacaoMuitosParaMuitos.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores){
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(this.jogadores == null) return;
        for (Jogador jogador: this.jogadores){
            System.out.println(jogador.getNome());
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
