package com.ronoyaro.javacore.Interface.dominio;

public class FileLoader implements DataLoader{
    @Override
    public void loader() {
        System.out.println("Carregando arquivos de dados");
    }
}
