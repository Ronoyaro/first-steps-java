package com.ronoyaro.javacore.classesUtils.datas;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(); //aceita um long e retorna um ms
        System.out.println(date.getTime()); //retorna um long que representa os ms atuais

    }
}
