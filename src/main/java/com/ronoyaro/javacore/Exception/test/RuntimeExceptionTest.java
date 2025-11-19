package com.ronoyaro.javacore.Exception.test;

public class RuntimeExceptionTest {
    private static void abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            throw new RuntimeException();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }

    private static String retornaConexao() {
        try {
            System.out.println("Abrindo conexao do sistema");
            System.out.println("Escrevendo dados no arquivo");
            return "conexao aberta";
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(retornaConexao());
    }
}
