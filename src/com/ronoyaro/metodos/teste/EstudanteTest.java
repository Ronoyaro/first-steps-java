package com.ronoyaro.metodos.teste;

import com.ronoyaro.metodos.dominio.Estudante;
import com.ronoyaro.metodos.dominio.Impressora;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Ronald";
        estudante.sexo = 'M';
        estudante.idade = 27;

        Impressora impressora = new Impressora();

        impressora.imprimeEstudante(estudante);
    }
}
