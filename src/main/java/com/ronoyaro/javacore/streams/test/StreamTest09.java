package com.ronoyaro.javacore.streams.test;


import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        //retonra valores entre 1 a 50 com 50 excluso
        IntStream.range(1, 50)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

            //retorna valores entre 1 a 50 com 50 incluso
        IntStream.rangeClosed(1, 50)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        int[] nums = {1,2,3,4,5,6,7};

      //  retorna uma média
         Arrays.stream(nums)
                .average()
                 .ifPresent(System.out::println);

    }
}
