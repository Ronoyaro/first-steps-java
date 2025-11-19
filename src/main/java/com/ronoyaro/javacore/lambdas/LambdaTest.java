package com.ronoyaro.javacore.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>(List.of("Bruno", "William", "Gomes", "Ronald"));


    }
//        List<Integer> integers = List.of(1, 2, 3);
//        List<String> championsLOL = List.of("Lucian", "Trundle", "Ashe", "Draven");
//        forEach(championsLOL, new Consumer<>() {
//            @Override
//            public void accept(String nome) {
//                System.out.println(nome);
//            }
//        });
//        forEach(integers, new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });
//
//        forEach(championsLOL, System.out::println);
//    }
//
//
//
//    private static <T> void forEach(List<T> lista, Consumer<T> consumer) {
//        for (T t : lista) {
//            consumer.accept(t);
//        }
//    }

}
