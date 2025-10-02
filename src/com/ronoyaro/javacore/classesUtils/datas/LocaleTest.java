package com.ronoyaro.javacore.classesUtils.datas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it","CH");
        Locale localeJP = new Locale("ja","JP");
        Calendar calendary = Calendar.getInstance();
        DateFormat dt1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dt2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat dt3 = DateFormat.getDateInstance(DateFormat.FULL, localeJP);

        System.out.println("Italia: " +dt1.format(calendary.getTime()));
        System.out.println("Suiça: "+dt2.format(calendary.getTime()));
        System.out.println("Japão: "+dt3.format(calendary.getTime()));
        System.out.println(localeJP.getDisplayCountry());
        System.out.println(localeItaly.getDisplayCountry(localeJP));


    }
}
