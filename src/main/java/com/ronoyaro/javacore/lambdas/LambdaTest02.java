package com.ronoyaro.javacore.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> championsTop = List.of("Darius", "Irelia", "Jax", "Renekton");
        List<String> map = map(championsTop, c -> c.toUpperCase());
        System.out.println(map);

    }

    private static <T, R> List<R> map(List<T> lista, Function<T, R> function) {
        List<R> resultList = new ArrayList<>();
        for(T e: lista) {
            R r = function.apply(e);
            resultList.add(r);
        }
        return resultList;
    }
}
