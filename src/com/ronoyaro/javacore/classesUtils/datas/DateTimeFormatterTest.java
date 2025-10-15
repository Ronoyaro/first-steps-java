package com.ronoyaro.javacore.classesUtils.datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        String format = now.format(DateTimeFormatter.BASIC_ISO_DATE);

        LocalDate parseDate = LocalDate.parse("20251014", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parseDate);


    }
}
