package com.ronoyaro.javacore.generics.teste;

import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorroList = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatoList = List.of(new Gato(), new Gato());
//
//        printaConsulta(cachorroList);
//        printaConsulta(gatoList);
        printaConsultaSuper(cachorroList);
    }
    public static void printaConsulta(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
    public static void printaConsultaSuper(List<? super Cachorro> animals) {
        for (Object animal : animals) {
            if(animal instanceof Cachorro){
                Cachorro cachorro = (Cachorro) animal;
                cachorro.consulta();
            }
        }
        animals.add(new Cachorro());
    }

    public static void printaConsultaSuperAnimal(List<? super Animal> animals) {
        for (Object animal : animals) {
            if(animal instanceof Cachorro){
                Cachorro cachorro = (Cachorro) animal;
                cachorro.consulta();
            }
        }
        animals.add(new Cachorro());
        animals.add(new Gato());
    }

}
