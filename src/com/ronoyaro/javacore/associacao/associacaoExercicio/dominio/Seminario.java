package com.ronoyaro.javacore.associacao.associacaoExercicio.dominio;

//Titulo - Introdução ao Java
//Titulo - Modelagem de Software

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;
    private Professor professor;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Local local){
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }


    public void imprime() {
        System.out.println("Titulo do seminário: " + this.titulo);
        if (this.local == null) return;
        System.out.println("Local agendado: " + this.local.getEndereco());
        if (this.alunos == null) return;
        System.out.println("Alunos cadastrados no Seminário: ");
        for (Aluno aluno : this.alunos) {
            System.out.println(aluno.getNome());
        }
        if(this.professor == null)return;
        System.out.println("Com o professor: " +this.professor.getNome());
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }

}
