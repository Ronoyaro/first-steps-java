package com.ronoyaro.javacore.streams.test;

import java.util.List;
import java.util.Optional;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        Integer sum = integers.stream()
                .reduce(0, Integer::sum);

        Integer reduce2 = integers.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println(sum);
        System.out.println(reduce2);

        Optional<Integer> numMax = integers.stream()
                .reduce(Integer::max);
        numMax.ifPresent(System.out::println);
    }
}
