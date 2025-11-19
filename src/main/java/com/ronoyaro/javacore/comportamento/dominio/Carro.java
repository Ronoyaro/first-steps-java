package com.ronoyaro.javacore.comportamento.dominio;

public class Carro {
    private String nome;
    private String color;
    private int year;

    public Carro(String nome, String color, int year) {
        this.nome = nome;
        this.color = color;
        this.year = year;
    }

    public String getNome() {
        return nome;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
