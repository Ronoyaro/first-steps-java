package com.ronoyaro.javacore.generics.teste;

import com.ronoyaro.javacore.generics.dominio.Barco;
import com.ronoyaro.javacore.generics.dominio.Carro;
import com.ronoyaro.javacore.generics.service.BarcoRentavelService;
import com.ronoyaro.javacore.generics.service.CarroRentavelService;

public class ClasseGenericaTest {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscaCarroDisponivel();
        System.out.println("Usando carro por um mês...");
        carroRentavelService.devolverCarroAlugado(carro);
        System.out.println("------------------------");
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscaBarcoDisponivel();
        System.out.println("Usando barco por um mês...");
        barcoRentavelService.devolverBarcoAlugado(barco);
    }


}
