package com.ronoyaro.javacore.polimorfismo.teste;

import com.ronoyaro.javacore.polimorfismo.dominio.Computador;
import com.ronoyaro.javacore.polimorfismo.dominio.Produto;
import com.ronoyaro.javacore.polimorfismo.dominio.Tomate;
import com.ronoyaro.javacore.polimorfismo.service.CalculadoraDeImposto;

public class ProdutoPolimorficoTeste {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Ryzen 5", 1000);
//        System.out.println(produto.getNome());
//        System.out.println(produto.getValor());
//        System.out.println(produto.calcularImposto());
        CalculadoraDeImposto.calcularImposto(produto1);
        System.out.println("------------------------------------");
        Produto produto2 = new Tomate("Siciliano", 7);
//        System.out.println(produto1.getNome());
//        System.out.println(produto1.getValor());
//        System.out.println(produto1.calcularImposto());
        CalculadoraDeImposto.calcularImposto(produto2);


    }
}
