package com.ronoyaro.javacore.modificadorFinal.dominio;

public class Ferrari {
    private String marca;

    public final void imprime(){
        System.out.println(this.marca);
    }
}
