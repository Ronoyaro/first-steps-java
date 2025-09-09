package com.ronoyaro.varargs.dominio;

public class Varargs {
    public int[] numeros;

    public void recebeVarargsPorParametro(int... numeros){
        for (int num: numeros){
            System.out.println(num);
        }
    }
}
