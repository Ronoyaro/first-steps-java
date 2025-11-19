package com.ronoyaro.javacore.orientacaoObjetos.classes.test;

import com.ronoyaro.javacore.orientacaoObjetos.classes.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro toyota = new Carro();
        Carro renault = new Carro();

        toyota.nome = "Toyota";
        toyota.ano = 2025;
        toyota.modelo = "Corolla";
        renault.nome = "Renault";
        renault.ano = 2025;
        renault.modelo = "Sandero";
    }
}
