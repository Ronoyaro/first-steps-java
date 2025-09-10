package com.ronoyaro.javacore.modificadoresDeAcesso.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("Digite uma idade valida");
            return;
        }
        this.idade = idade;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
}
