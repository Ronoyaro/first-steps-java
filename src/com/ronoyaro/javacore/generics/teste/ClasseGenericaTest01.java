package com.ronoyaro.javacore.generics.teste;

import com.ronoyaro.javacore.generics.dominio.Barco;
import com.ronoyaro.javacore.generics.dominio.Carro;
import com.ronoyaro.javacore.generics.service.AutoRentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        List<Carro> carroList = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fuscão")));
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Canoa"), new Barco("Yate")));
        AutoRentalService<Carro> carroRentalService = new AutoRentalService<>(carroList);
        AutoRentalService<Barco> barcoRentalService = new AutoRentalService<>(barcoList);
        Carro carro = carroRentalService.buscaAutoDisponivel();
        carroRentalService.devolverAutoAlugado(carro);
        System.out.println("------------------");
        Barco barco = barcoRentalService.buscaAutoDisponivel();
        barcoRentalService.devolverAutoAlugado(barco);
    }
}
