package com.ronoyaro.javacore.Interface.dominio;

public interface DataLoader {
    void loader();
    default void checkPermission(){
        System.out.println("Checando permissoes do banco de dados");
    }
}
