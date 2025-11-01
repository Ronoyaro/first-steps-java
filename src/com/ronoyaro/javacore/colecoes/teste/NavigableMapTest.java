package com.ronoyaro.javacore.colecoes.teste;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest {
    public static void main(String[] args) {
        NavigableMap<String, String> navigableMap = new TreeMap<>(); //recebe também um objeto Comparator
        navigableMap.put("A", "Letra A");
        navigableMap.put("E", "Letra E");
        navigableMap.put("C", "Letra C");
        navigableMap.put("D", "Letra D");
        navigableMap.put("B", "Letra B");

        for (Map.Entry<String, String> entry : navigableMap.entrySet()) {
            System.out.println(entry.getKey() +": " + entry.getValue());
        }

        System.out.println(navigableMap.headMap("C")); //retorna o que está abaixo
        System.out.println(navigableMap.headMap("C", true)); //retorna o que está abaixo e o objeto

        Map.Entry<String, String> entry = navigableMap.higherEntry("D");
        System.out.println("----------------");
        System.out.println(entry);


    }
}
