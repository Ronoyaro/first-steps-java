package com.ronoyaro.javacore.orientacaoObjetos.heranca.dominio;

public class Pessoa {
    // Protected permite que os atributos e metodos sejam acessiveis se estiverem
    //dentro do mesmo pacote
    //Fora do pacote apenas se for uma subclasse (extends)
    protected String nome;
    protected int cpf;
    protected Endereco endereco;


    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome, int cpf){
        this(nome);
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + ", " +this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
