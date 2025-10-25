package com.ronoyaro.javacore.colecoes.teste;

import com.ronoyaro.javacore.colecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABCD1", "Xiaomi");
        Smartphone s2 = new Smartphone("1ABCD1", "iPhone");

        boolean equals = s1.equals(s2);
        System.out.println(equals);
    }
}
