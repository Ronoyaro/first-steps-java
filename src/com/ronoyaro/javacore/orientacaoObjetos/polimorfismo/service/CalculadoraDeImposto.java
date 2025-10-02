package com.ronoyaro.javacore.orientacaoObjetos.polimorfismo.service;

import com.ronoyaro.javacore.orientacaoObjetos.polimorfismo.dominio.Produto;
import com.ronoyaro.javacore.orientacaoObjetos.polimorfismo.dominio.Tomate;



public class CalculadoraDeImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + produto.calcularImposto());

        //Narrowing casting
        if(produto instanceof Tomate){
            String dataDeValidade = ((Tomate) produto).getDataDeValidade();
            System.out.println(dataDeValidade);
        }
    }
}
