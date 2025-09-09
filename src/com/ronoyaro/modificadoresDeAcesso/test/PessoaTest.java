package com.ronoyaro.modificadoresDeAcesso.test;

import com.ronoyaro.modificadoresDeAcesso.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Ronald");
        pessoa.setIdade(27);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
