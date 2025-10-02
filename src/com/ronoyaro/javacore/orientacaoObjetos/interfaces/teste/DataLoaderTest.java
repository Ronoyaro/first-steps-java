package com.ronoyaro.javacore.orientacaoObjetos.interfaces.teste;

import com.ronoyaro.javacore.orientacaoObjetos.interfaces.dominio.DatabaseLoader;
import com.ronoyaro.javacore.orientacaoObjetos.interfaces.dominio.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.loader();
        fileLoader.loader();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();


    }
}
