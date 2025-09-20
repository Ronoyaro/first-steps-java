package com.ronoyaro.javacore.polimorfismo.service;

import com.ronoyaro.javacore.polimorfismo.dominio.Computador;
import com.ronoyaro.javacore.polimorfismo.dominio.Tomate;

public class CalculadoraDeImposto {
    public static void calcularImposto(Computador computador) {
        System.out.println("Calculando imposto de " + computador.getNome());
        System.out.println("Valor do produto: " + computador.getValor());
        System.out.println("Imposto do computador " +Computador.IMPOSTO);
        System.out.println("Imposto a ser pago: " + computador.calcularImposto());
    }

    public static void calcularImposto(Tomate tomate) {
        System.out.println("Calculando imposto de " + tomate.getNome());
        System.out.println("Valor do produto: " + tomate.getValor());
        System.out.println("Imposto do produto: "+ Tomate.IMPOSTO );
        System.out.println("Imposto a ser pago: " + tomate.calcularImposto());
    }
}
