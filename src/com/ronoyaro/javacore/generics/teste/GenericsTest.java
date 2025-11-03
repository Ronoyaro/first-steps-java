package com.ronoyaro.javacore.generics.teste;

import com.ronoyaro.javacore.colecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add(10);
        lista.add("All Might");
        lista.add(new Consumidor("Midoriya"));
        System.out.println(lista);

        for (Object o : lista) {
            if(o instanceof String) {
                System.out.println(o);
            }
            if(o instanceof Integer) {
                System.out.println(o);
            }
            if(o instanceof Consumidor) {
               Consumidor c = (Consumidor) o;
                System.out.println(c);
            }
        }

    }
}
