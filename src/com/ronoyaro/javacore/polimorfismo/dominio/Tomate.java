package com.ronoyaro.javacore.polimorfismo.dominio;

public class Tomate extends Produto {
    public static final double IMPOSTO = 0.05;
    public Tomate(String nome, int valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto...");
        return this.valor * IMPOSTO;
    }
}
