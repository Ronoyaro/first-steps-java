package com.ronoyaro.javacore.metodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario: this.salarios){
            System.out.print(salario + " ");
        }
    }
    public void mediaSalario(){
        double acc = 0;
        for (double salario: this.salarios){
            acc += salario;
        }
        acc /= this.salarios.length;
        System.out.println("\nMedia salarial " +acc);
    }
}
