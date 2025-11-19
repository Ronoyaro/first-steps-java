package com.ronoyaro.javacore.colecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(); //capacidade inicial de 16;
        nomes.add("Link");
        nomes.add("Zelda");
        nomes.add("Urbosa");
        nomes.add("Mipha");
        nomes.add("Rivali");

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Bokoblin");
        nomes2.add("Lizalfos");
        nomes2.add("Lynel");
        nomes2.add("Yiga");

        nomes.addAll(nomes2);

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
        System.out.println("---------------------");
        for (String nome : nomes) {
            System.out.println(nome); //retorna cada nome
        }

        nomes.remove("Zelda");

    }
}
