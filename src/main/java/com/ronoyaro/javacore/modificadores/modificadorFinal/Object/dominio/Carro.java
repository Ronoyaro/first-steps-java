package com.ronoyaro.javacore.modificadores.modificadorFinal.Object.dominio;

public class Carro {
    private String marca;
    public final Comprador COMPRADOR = new Comprador();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", COMPRADOR=" + COMPRADOR +
                '}';
    }
}
