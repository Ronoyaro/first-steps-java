package com.ronoyaro.javacore.Exception.trywithresources.dominio;

import java.io.IOException;

public class TryWithResourcesTest2 {
    public static void lerArquivo() {
        try(Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()) {

        }catch(IOException e){

        }
    }
    public static void main(String[] args) {
        lerArquivo();

    }
}
