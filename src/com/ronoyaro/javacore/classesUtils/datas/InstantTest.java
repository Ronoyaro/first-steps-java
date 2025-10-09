package com.ronoyaro.javacore.classesUtils.datas;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class InstantTest {
    public static void main(String[] args) {

        Instant now = Instant.now();
        System.out.println(now);
//        System.out.println(now.getNano()); /// retorna um int 999.999.999 que é uma representação de 1 bilhão de nanosegundos para 1 segundo.
//        System.out.println(now.getEpochSecond());  //retorna um long
//        System.out.println(Instant.ofEpochSecond(3)); //retorna um Instant 1970-01-01T00:00:03Z
//        System.out.println(Instant.ofEpochSecond(3, 1_000_000_000)); //1970-01-01T00:00:04Z
//        System.out.println(Instant.ofEpochSecond(3, -1_000_000_000)); //1970-01-01T00:00:02Z

        System.out.println(now);
    }
}
