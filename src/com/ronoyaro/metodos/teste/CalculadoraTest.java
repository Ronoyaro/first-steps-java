package com.ronoyaro.metodos.teste;

import com.ronoyaro.metodos.dominio.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(2.5f, 5);

        double resultado = calculadora.divideDoisNumeros(5, 0);
        System.out.println("Resultado da divisão " + resultado);
    }
}
