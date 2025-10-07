package com.ronoyaro.javacore.classesUtils.datas;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(Locale.getDefault());
        nfa[2] = NumberFormat.getCurrencyInstance((Locale.JAPAN));
        nfa[3] = NumberFormat.getCurrencyInstance(Locale.ENGLISH);

        for (NumberFormat numberFormat: nfa){
            System.out.println(numberFormat.format(1000.20));
        }
    }
}
