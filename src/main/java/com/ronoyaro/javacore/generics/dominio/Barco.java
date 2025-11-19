package com.ronoyaro.javacore.generics.dominio;

public class Barco {
    String nome;

    public Barco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
