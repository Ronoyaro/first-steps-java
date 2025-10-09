package com.ronoyaro.javacore.classesUtils.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(1998, 3, 13, 20, 10, 0);

        System.out.println(ChronoUnit.DAYS.between(dateTime, LocalDateTime.now()));
        System.out.println(ChronoUnit.WEEKS.between(dateTime, LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(dateTime, LocalDateTime.now()));
        System.out.println(ChronoUnit.YEARS.between(dateTime, LocalDateTime.now()));
    }
}
