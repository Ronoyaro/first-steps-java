package com.ronoyaro.javacore.classesUtils.datas;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        localDate = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println(localDate);

        localDate = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.TUESDAY));
        System.out.println(localDate);

        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println(DayOfWeek.WEDNESDAY);

        System.out.println(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));

    }
}
