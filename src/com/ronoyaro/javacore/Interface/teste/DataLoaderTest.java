package com.ronoyaro.javacore.Interface.teste;

import com.ronoyaro.javacore.Interface.dominio.DatabaseLoader;
import com.ronoyaro.javacore.Interface.dominio.FileLoader;

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
