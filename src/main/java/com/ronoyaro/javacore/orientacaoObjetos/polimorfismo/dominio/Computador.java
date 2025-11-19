package com.ronoyaro.javacore.orientacaoObjetos.polimorfismo.dominio;

public class Computador extends Produto {
    public static final double IMPOSTO = 0.21;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto...");
        return this.valor * IMPOSTO;
    }

}

