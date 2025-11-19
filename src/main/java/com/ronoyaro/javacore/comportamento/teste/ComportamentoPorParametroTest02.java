package com.ronoyaro.javacore.comportamento.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numerosPares = filterAny(integers, i -> i % 2 == 0);
        System.out.println(numerosPares);
    }

    private static <T> List<T> filterAny(List<T> list, Predicate<T> predicate) {
        List<T> novaLista = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                novaLista.add(e);
            }
        }
        return novaLista;
    }
}
