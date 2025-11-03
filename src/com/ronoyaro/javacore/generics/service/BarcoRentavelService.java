package com.ronoyaro.javacore.generics.service;

import com.ronoyaro.javacore.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> BarcosDisponiveis = new ArrayList<>(List.of(new Barco("Canoa"), new Barco("Lancha")));

    public Barco buscaBarcoDisponivel() {
        System.out.println("Buscando Barco disponivel...");
        Barco barcoRemovido = BarcosDisponiveis.remove(0);
        System.out.println("Alugando Barco: " +barcoRemovido);
        System.out.println("Barcos disponiveis:");
        System.out.println(barcoRemovido);
        return barcoRemovido;
    }

    public void devolverBarcoAlugado(Barco barco) {
        System.out.println("Devolvendo Barco: " +barco);
        BarcosDisponiveis.add(barco);
        System.out.println("Barcos disponiveis para alugar:");
        System.out.println(BarcosDisponiveis);
    }
}
