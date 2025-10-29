package com.ronoyaro.javacore.colecoes.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysToListTest {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] numerosArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(numerosArray));

        Integer[] newNumerosArray = new Integer[]{1,2,3,4};

        List<Integer> integerList = Arrays.asList(newNumerosArray);
        List<Integer> integerList1 = Arrays.asList(1, 2, 3, 4, 5);

        ArrayList<Integer> integers = new ArrayList<>(integerList);




    }
}
