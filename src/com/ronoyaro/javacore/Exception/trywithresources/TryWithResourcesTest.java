package com.ronoyaro.javacore.Exception.trywithresources;


import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {
    try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){

    } catch (IOException e){
        e.printStackTrace();
    }
    }
}
