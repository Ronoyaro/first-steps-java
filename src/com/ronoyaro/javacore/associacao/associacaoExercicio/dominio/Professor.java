package com.ronoyaro.javacore.associacao.associacaoExercicio.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
       this(nome);
       this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this(nome, especialidade);
        this.seminarios = seminarios;
    }

    public void imprime() {
        if (this.seminarios == null) return;
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario);
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

}
