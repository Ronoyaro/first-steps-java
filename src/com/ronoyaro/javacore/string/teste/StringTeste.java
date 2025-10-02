package com.ronoyaro.javacore.string.teste;

public class StringTeste {
    public static void main(String[] args) {
        String nome = "Ronald"; //String literal
        String nomeTrim = "          Ronald           ";
        String nome2 = "Ronald";
        System.out.println(nome == nome2);

        String nome3 = new String("Ronald"); //Objeto

        System.out.println(nome == nome3.intern());

        System.out.println(nome.replace("l", "u"));
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.substring(0, 3));
        System.out.println(nome.trim());
    }
}
