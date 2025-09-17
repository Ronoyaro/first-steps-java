package com.ronoyaro.javacore.classesAbstratas.teste;

import com.ronoyaro.javacore.classesAbstratas.dominio.Desenvolvedor;
import com.ronoyaro.javacore.classesAbstratas.dominio.Funcionario;
import com.ronoyaro.javacore.classesAbstratas.dominio.Gerente;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000d);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Sanji", 4000);
        System.out.println(desenvolvedor);
    }
}
