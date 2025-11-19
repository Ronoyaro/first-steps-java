package com.ronoyaro.javacore.orientacaoObjetos.associacao.associacaoUniUmParaMuitos.dominio;

public class Time {
    private String nome;

    public Time(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

}
