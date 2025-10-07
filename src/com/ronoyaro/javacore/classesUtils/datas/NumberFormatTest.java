package com.ronoyaro.javacore.classesUtils.datas;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(Locale.getDefault());
        nfa[2] = NumberFormat.getInstance(Locale.JAPAN);
        nfa[3] = NumberFormat.getInstance(Locale.ENGLISH);

        for (NumberFormat numberFormat: nfa){
            System.out.println(numberFormat.format(1000.20));
        }
    }
}
