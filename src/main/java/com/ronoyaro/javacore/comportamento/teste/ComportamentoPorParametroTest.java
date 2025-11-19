package com.ronoyaro.javacore.comportamento.teste;


import com.ronoyaro.javacore.comportamento.dominio.CarPredicate;
import com.ronoyaro.javacore.comportamento.dominio.Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest {
    public static void main(String[] args) {
        List<Carro> carroList = new ArrayList<>(List.of(
                new Carro("Fusca", "green", 2015),
                new Carro("BMW", "black", 2020),
                new Carro("Mercedes", "red", 2014)));

        List<Carro> filterByColor = filter(carroList, new CarPredicate() {
            @Override
            public boolean test(Carro carro) {
                return carro.getColor().equals("green");
            }
        });

        List<Carro> filterbyYearAfter = filter(carroList, new CarPredicate() {
            @Override
            public boolean test(Carro carro) {
                return carro.getYear() >= 2015;
            }
        });

        System.out.println(filterByColor);
        System.out.println(filterbyYearAfter);

        List<Carro> filterByNameWithLambda = filter(carroList, (c -> c.getNome().equals("BMW")));
        System.out.println(filterByNameWithLambda);

    }

    private static List<Carro> filter(List<Carro> carros, CarPredicate car) {
        List<Carro> novaLista = new ArrayList<>();
        for (Carro carro : carros) {
            if (car.test(carro)) {
                novaLista.add(carro);
            }
        }
        return novaLista;
    }


}
