package com.ronoyaro.javacore.metodos.dominio;

public class Impressora {
    public void imprimeEstudante(Estudante estudante){
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
