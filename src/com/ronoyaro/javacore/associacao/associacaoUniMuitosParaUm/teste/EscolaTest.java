package com.ronoyaro.javacore.associacao.associacaoUniMuitosParaUm.teste;

import com.ronoyaro.javacore.associacao.associacaoUniMuitosParaUm.dominio.Escola;
import com.ronoyaro.javacore.associacao.associacaoUniMuitosParaUm.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Tsunade");
        Professor professor3 = new Professor("Orochimaru");

        Professor[] professores = new Professor[]{professor1, professor2, professor3};

        Escola escola = new Escola("Konoha", professores);

    escola.imprime();


    }

}
