package com.ronoyaro.javacore.generics.service;

import com.ronoyaro.javacore.generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));

    public Carro buscaCarroDisponivel() {
        System.out.println("Buscando carro disponivel...");
        Carro carroRemovido = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro:" +carroRemovido);
        System.out.println("Carros disponiveis:");
        System.out.println(carrosDisponiveis);
        return carroRemovido;
    }

    public void devolverCarroAlugado(Carro carro) {
        System.out.println("Devolvendo carro: " +carro);
        carrosDisponiveis.add(carro);
        System.out.println("carros disponiveis para alugar:");
        System.out.println(carrosDisponiveis);
    }
}
