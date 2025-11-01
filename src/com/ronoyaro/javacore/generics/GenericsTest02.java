package com.ronoyaro.javacore.generics;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest02 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        addList(lista, "Um");
        addList(lista, "Dois");
        addList(lista, "Tres");

        for (String s : lista) {
            System.out.println(s);
        }
    }

    public static void addList(List<String> lista, String valor) {
        lista.add(valor);
    }
}
