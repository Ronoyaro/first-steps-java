package com.ronoyaro.javacore.modificadores.modificadorFinal.Object.teste;

import com.ronoyaro.javacore.modificadores.modificadorFinal.Object.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.COMPRADOR.setNome("Ronald");
        carro.setMarca("HB20");

        System.out.println(carro);


    }
}
