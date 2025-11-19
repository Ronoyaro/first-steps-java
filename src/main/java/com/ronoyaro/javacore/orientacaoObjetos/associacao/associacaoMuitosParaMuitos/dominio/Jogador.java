package com.ronoyaro.javacore.orientacaoObjetos.associacao.associacaoMuitosParaMuitos.dominio;

import java.util.Objects;

public class Jogador {
    private String nome;
    private Time time;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.time.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jogador jogador = (Jogador) o;
        return Objects.equals(nome, jogador.nome) && Objects.equals(time, jogador.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, time);
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
