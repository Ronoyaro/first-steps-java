package com.ronoyaro.javacore.classesUtils.datas;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate dateAfter2Years = LocalDate.now().plusYears(2).plusDays(7);

        Period p1 = Period.between(date, dateAfter2Years);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);
        Period p4 = Period.ofMonths(3);
        Period p5 = Period.ofYears(3);

        date.until(date.plusDays(p3.getDays()),ChronoUnit.MONTHS);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

    }
}
