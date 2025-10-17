package com.ronoyaro.javacore.classesUtils.datas;

import java.time.*;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
//        LocalDate date = LocalDate.of(2025, Month.OCTOBER, 7);
//        LocalTime time = LocalTime.of(15, 9);
//        LocalDateTime dateTime = LocalDateTime.of(date, time);
//        System.out.println(dateTime);

        LocalDate date = LocalDate.parse("2025-10-07");
        LocalTime time = LocalTime.parse("15:20");

        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt1);
        System.out.println(ldt2);

        System.out.println(LocalDateTime.now());

        Instant instant = ldt1.toInstant(ZoneOffset.UTC);
        System.out.println(instant);


    }
}
