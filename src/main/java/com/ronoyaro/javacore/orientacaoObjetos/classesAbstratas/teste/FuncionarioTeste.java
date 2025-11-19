package com.ronoyaro.javacore.orientacaoObjetos.classesAbstratas.teste;

import com.ronoyaro.javacore.orientacaoObjetos.classesAbstratas.dominio.Desenvolvedor;
import com.ronoyaro.javacore.orientacaoObjetos.classesAbstratas.dominio.Gerente;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000d);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Sanji", 4000);
        System.out.println(desenvolvedor);
    }
}
