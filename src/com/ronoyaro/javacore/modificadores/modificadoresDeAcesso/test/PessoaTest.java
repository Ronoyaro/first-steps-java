package com.ronoyaro.javacore.modificadores.modificadoresDeAcesso.test;

import com.ronoyaro.javacore.modificadores.modificadoresDeAcesso.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Ronald");
        pessoa.setIdade(27);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
