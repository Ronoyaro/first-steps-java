package com.ronoyaro.javacore.colecoes.teste;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map =  new HashMap<>();
        map.put("Aluno", "Naruto");
        map.put("Professor", "Jiraya");
        map.put("Aluno", "Obito");
        map.put("Professor", "Kakashi");

        for(String key: map.keySet()) {
            System.out.println("Chave: " +key);
        }
        for (String value: map.values()) {
            System.out.println("Valor: " +value);
        }

        for(String key: map.keySet()) {
            System.out.println(key +": " + map.get(key));
        }

        System.out.println("-------------------------");

        for(Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() +": " + entry.getValue());
        }

        System.out.println("-------------------------------");
        Map<String, String> map1 = new LinkedHashMap<>();

        map1.put("Fighter", "Lutador");
        map1.put("Lancer", "Lanceiro");
        map1.put("Shooter", "Atirador");

        for(String classes : map1.keySet()) {
            System.out.println(classes +": " +map1.get(classes));
        }

    }
}
