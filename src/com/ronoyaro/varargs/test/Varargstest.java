package com.ronoyaro.varargs.test;

import com.ronoyaro.varargs.dominio.Varargs;

public class Varargstest {
    public static void main(String[] args) {
        Varargs varargs = new Varargs();

        varargs.numeros = new int[]{20, 30, 40};

        varargs.recebeVarargsPorParametro(varargs.numeros);

    }
}
