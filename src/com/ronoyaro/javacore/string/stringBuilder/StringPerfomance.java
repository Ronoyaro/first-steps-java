package com.ronoyaro.javacore.string.stringBuilder;

public class StringPerfomance {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(10_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: " +(fim - inicio) +"ms");
        inicio = System.currentTimeMillis();
        concatStringBuilder(10_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto com StringBuilder: " +(fim - inicio) +"ms");

        StringBuilder sb2 = new StringBuilder("Ronald de ");
        sb2.append("Jesus").append(" Ferreira");
        String sb3 = sb2.substring(0,2);
        System.out.println(sb3);
    }

    public static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for(int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }


    public static void concatString(int tamanho) {
        String value = "";
        for (int i = 0; i < tamanho; i++) {
            value += i;
        }
    }


}
