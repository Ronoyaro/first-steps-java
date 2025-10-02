package com.ronoyaro.javacore.orientacaoObjetos.enums.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public final int VALOR;
    public final String NOME_RELATORIO;
    TipoCliente(int valor, String nomeRelatorio) {
    this.VALOR = valor;
    this.NOME_RELATORIO = nomeRelatorio;
    }

}
