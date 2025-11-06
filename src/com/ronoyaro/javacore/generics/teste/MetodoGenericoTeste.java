package com.ronoyaro.javacore.generics.teste;

import com.ronoyaro.javacore.generics.dominio.Barco;
import com.ronoyaro.javacore.generics.dominio.Carro;

import java.util.List;

public class MetodoGenericoTeste {
    public static void main(String[] args) {
        Carro carro = new Carro("Fuscão");

        criarListaObjeto(new Barco("Canoa"));
        criarListaObjeto(carro);

    }

    public static <T> void criarListaObjeto(T t) {
        List<T> lista = List.of(t);
        System.out.println(lista);
    }
}
