package com.ronoyaro.javacore.classesAnonimas;


import com.ronoyaro.javacore.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Animal {
    public void walk() {
        System.out.println("cachorro andando");
    }
}

public class ClasseAnonimaTest {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void walk() {
                System.out.println("Cachorro anonimo andando");
            }
        };
        animal.walk();

        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Iate"), new Barco("Canoa")));

        barcoList.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        System.out.println(barcoList);
    }

}
