package com.ronoyaro.metodos.teste;

import com.ronoyaro.metodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Ronald";
        funcionario.idade = 27;
        funcionario.salarios = new double[]{1200, 1500, 1700};
       funcionario.imprimeDados();
       funcionario.mediaSalario();
    }
}
