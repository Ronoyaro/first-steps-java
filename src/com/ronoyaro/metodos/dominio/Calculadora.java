package com.ronoyaro.metodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(10-5);
    }
    public void multiplicaDoisNumeros(double num1, double num2){
        System.out.println(num1 * num2);
    }
    public double divideDoisNumeros(double num1, double num2){
        if(num1 == 0 || num2 == 0){
            System.out.println("Nao divisivel por 0");
            return 0;
        }
        return num1 / num2;
    }
}
