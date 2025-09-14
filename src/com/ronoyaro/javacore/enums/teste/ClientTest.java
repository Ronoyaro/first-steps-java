package com.ronoyaro.javacore.enums.teste;

import com.ronoyaro.javacore.enums.dominio.Cliente;
import com.ronoyaro.javacore.enums.dominio.TipoCliente;

public class ClientTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ronald", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Ronoyar0", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente);
        System.out.println(cliente2);

    }
}
