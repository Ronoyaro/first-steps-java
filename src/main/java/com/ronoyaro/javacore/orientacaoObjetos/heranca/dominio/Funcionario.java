package com.ronoyaro.javacore.orientacaoObjetos.heranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public Funcionario(String nome) {
        super(nome);
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);

    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + ", recebi o o salario no valor de " + this.salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
