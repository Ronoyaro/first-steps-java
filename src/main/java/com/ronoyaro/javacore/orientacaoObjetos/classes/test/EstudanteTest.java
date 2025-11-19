package com.ronoyaro.javacore.orientacaoObjetos.classes.test;

import com.ronoyaro.javacore.orientacaoObjetos.classes.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Ronald";
        estudante.idade = 27;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
