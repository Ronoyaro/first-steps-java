package com.ronoyaro.javacore.associacao.associacaoUniMuitosParaUm.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime() {
        System.out.println("Escola: " + this.nome);
        if (professores == null) return;
        for (Professor professor : professores) {
            System.out.println("Professor: " + professor.getNome());
        }
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return this.nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }
}
