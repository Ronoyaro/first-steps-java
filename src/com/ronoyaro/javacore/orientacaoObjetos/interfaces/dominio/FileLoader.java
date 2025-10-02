package com.ronoyaro.javacore.orientacaoObjetos.interfaces.dominio;

public class FileLoader implements DataLoader{
    @Override
    public void loader() {
        System.out.println("Carregando arquivos de dados");
    }
}
