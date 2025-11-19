package com.ronoyaro.javacore.generics.teste;

abstract class Animal {
    abstract void consulta();
}

class Cachorro extends Animal {
    @Override
    void consulta() {
        System.out.println("examinando cachorro...");
    }
}

class Gato extends Animal {
    @Override
    void consulta() {
        System.out.println("examinando gato...");
    }
}


public class WildCardsTest {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        Animal[] animal = {new Cachorro(),new Gato()};
        printaConsulta(animal);
        printaConsulta(gatos);
        printaConsulta(cachorros);

    }

    public static void printaConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
            animals[1] = new Gato();
        }
    }
}
