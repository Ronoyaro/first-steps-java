package com.ronoyaro.javacore.orientacaoObjetos.polimorfismo.teste;

import com.ronoyaro.javacore.orientacaoObjetos.polimorfismo.dominio.Computador;
import com.ronoyaro.javacore.orientacaoObjetos.polimorfismo.dominio.Tomate;
import com.ronoyaro.javacore.orientacaoObjetos.polimorfismo.service.CalculadoraDeImposto;

public class ImpostoTeste {
    public static void main(String[] args) {
        Computador computador = new Computador("DellI7", 4000);
        Tomate tomate = new Tomate("Tomate Redondinho", 5);

        CalculadoraDeImposto.calcularImposto(computador);
        System.out.println("-------------------------");

        //imprimo o valor a validade de produto utilizando o instanceof
        CalculadoraDeImposto.calcularImposto(tomate);
    }
}
