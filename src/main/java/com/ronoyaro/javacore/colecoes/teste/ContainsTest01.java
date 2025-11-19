package com.ronoyaro.javacore.colecoes.teste;

import com.ronoyaro.javacore.colecoes.dominio.Smartphone;

import java.util.ArrayList;

public class ContainsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABCD1", "Xiaomi");
        Smartphone s2 = new Smartphone("1ABCD1", "iPhone");
        Smartphone s3 = new Smartphone("22222", "Pixel");

        ArrayList<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        Smartphone s4 = new Smartphone("22222", "Pixel");

        boolean contains = smartphones.contains(s4); //acessa s4.equals();
        System.out.println(contains);

        int index = smartphones.indexOf(s4);
        System.out.println(index);
        Smartphone smartphone = smartphones.get(index);
        System.out.println(smartphone);
    }
}
