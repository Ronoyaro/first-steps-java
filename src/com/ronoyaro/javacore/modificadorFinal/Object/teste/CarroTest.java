package com.ronoyaro.javacore.modificadorFinal.Object.teste;

import com.ronoyaro.javacore.modificadorFinal.Object.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.COMPRADOR.setNome("Ronald");
        carro.setMarca("HB20");

        System.out.println(carro);


    }
}
