package com.ronoyaro.javacore.generics.service;

import java.util.ArrayList;
import java.util.List;

public class AutoRentalService<E> {
  private List<E> autoDisponivel;

    public AutoRentalService(List<E> autoDisponivel) {
        this.autoDisponivel = autoDisponivel;
    }

    public E buscaAutoDisponivel() {
        System.out.println("Buscando automóvel disponivel...");
        E e = autoDisponivel.removeFirst();
        System.out.println(e);
        System.out.println("Automoveis disponiveis:");
        System.out.println(autoDisponivel);
        return e;
    }
    public void devolverAutoAlugado(E e) {
        System.out.println("Devolvendo automovel alugado: " +e);
        autoDisponivel.add(e);
        System.out.println("Autos disponiveis para alugar:");
        System.out.println(autoDisponivel);
    }

}
