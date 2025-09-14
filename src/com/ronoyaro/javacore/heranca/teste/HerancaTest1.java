package com.ronoyaro.javacore.heranca.teste;

import com.ronoyaro.javacore.heranca.dominio.Endereco;
import com.ronoyaro.javacore.heranca.dominio.Funcionario;
import com.ronoyaro.javacore.heranca.dominio.Pessoa;

public class HerancaTest1 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 1");
        endereco.setCep("12345");

        Endereco endereco2 = new Endereco();
        endereco2.setCep("123456");
        endereco2.setRua("Miami City");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Ronald");
        pessoa1.setCpf(123456);
        pessoa1.setEndereco(endereco);
        pessoa1.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Dexter");
        funcionario.setCpf(253560);
        funcionario.setEndereco(endereco2);
        funcionario.setSalario(3000d);

        funcionario.imprime();

    }
}
