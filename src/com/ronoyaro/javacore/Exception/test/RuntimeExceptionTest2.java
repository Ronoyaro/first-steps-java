package com.ronoyaro.javacore.Exception.test;

public class RuntimeExceptionTest2 {
    private static int divisao(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não divisivel por 0");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
       try {
           System.out.println(divisao(10, 0));
       } catch (IllegalArgumentException e) {
           e.printStackTrace();
       }
        System.out.println("Continue");
    }
}
