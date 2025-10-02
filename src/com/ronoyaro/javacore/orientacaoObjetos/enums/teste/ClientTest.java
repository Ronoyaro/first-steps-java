package com.ronoyaro.javacore.orientacaoObjetos.enums.teste;

import com.ronoyaro.javacore.orientacaoObjetos.enums.dominio.Cliente;
import com.ronoyaro.javacore.orientacaoObjetos.enums.dominio.TipoCliente;
import com.ronoyaro.javacore.orientacaoObjetos.enums.dominio.TipoPagamento;

public class ClientTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ronald", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Ronoyar0", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente);
        System.out.println(cliente2);

        System.out.println(cliente.getTipoPagamento().calculaDesconto(100));



    }
}
