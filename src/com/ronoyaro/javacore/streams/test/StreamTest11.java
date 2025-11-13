package com.ronoyaro.javacore.streams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest11 {
    public static void main(String[] args) {

        //ForEach
        Stream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(System.out::println);

        //Fibonnaci

        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(9)
                .forEach(n -> System.out.println(Arrays.toString(n)));
    
        //Gerando numeros aleatorios
        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1, 30))
                .limit(5)
                .forEach(System.out::println);
    }
}
