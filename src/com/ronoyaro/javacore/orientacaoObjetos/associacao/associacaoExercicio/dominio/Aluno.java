package com.ronoyaro.javacore.orientacaoObjetos.associacao.associacaoExercicio.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime(){
        System.out.println("Aluno Cadastrado no seminário de: "+seminario.getTitulo());
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSeminario(Seminario seminario){
        this.seminario = seminario;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
