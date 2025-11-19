package com.ronoyaro.javacore.Exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {
    public static void criarNovoArquivo() throws IOException {
        try {
            File arquivo = new File("arquivo\\teste.txt");
            boolean isCriado = arquivo.createNewFile(); //retorna true ou false
        } catch(IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            criarNovoArquivo();
        } catch (IOException e) {
            System.out.println("Não foi possivel");
        }
    }
}
