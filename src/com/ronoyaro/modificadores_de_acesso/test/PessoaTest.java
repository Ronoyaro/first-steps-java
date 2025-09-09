package com.ronoyaro.modificadores_de_acesso.test;

import com.ronoyaro.modificadores_de_acesso.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Ronald");
        pessoa.setIdade(27);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
