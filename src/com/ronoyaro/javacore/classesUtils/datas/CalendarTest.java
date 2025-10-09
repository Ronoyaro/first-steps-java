package com.ronoyaro.javacore.classesUtils.datas;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        //Calendar classe abstract
        Calendar calendary = Calendar.getInstance();
        Date date = calendary.getTime();
        System.out.println(date);

        if (calendary.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("is sunday!");
        }
        System.out.println(calendary.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendary.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendary.get(Calendar.DAY_OF_YEAR));

        //Add me retorna uma data
        calendary.add(Calendar.DAY_OF_MONTH, 7);
//      calendary.add(Calendar.HOUR, 12);
        calendary.roll(Calendar.HOUR, 12);
        Date date2 = calendary.getTime();
        System.out.println(date2);

        System.out.println(Calendar.getInstance().getTime());

        Calendar c2 = Calendar.getInstance();
        c2.add(Calendar.HOUR, 20);
        System.out.println(c2.getTime());
       c2.add(Calendar.HOUR, 10);
        System.out.println(c2.getTime());


    }
}
