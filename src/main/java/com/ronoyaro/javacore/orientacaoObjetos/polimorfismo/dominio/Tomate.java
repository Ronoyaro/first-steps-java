package com.ronoyaro.javacore.orientacaoObjetos.polimorfismo.dominio;

public class Tomate extends Produto {
    public static final double IMPOSTO = 0.05;
    public String dataDeValidade = "20/09/2025";
    public Tomate(String nome, int valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto...");
        return this.valor * IMPOSTO;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }
}
