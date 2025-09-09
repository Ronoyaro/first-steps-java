package com.ronoyaro.introducao;

/*
Aula de tipos primitivos
Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereco <endereco>,
confirmo que recebi o salario de <salario>, na data <data>.
 */

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /*String name = "Ronald";
        String adress = "2 Travessa da Paz, n9";
        int salary = 1710;
        String date = new Date().toString();
        String relatorio = "Eu " +name+ ", morando no endereço " +adress+
                " confirmo que recebi o salario de " +salary+ ", na data " +date;

        System.out.println(relatorio);
        */
//        int num1 = 10;
//        int num2 = 20;
//
//        System.out.println("Valor: " + (num1 + num2));

        double bonus = 1000;

//        bonus+= 1000;

        System.out.println(bonus);

        double salario = 6000;
        String doarSalario = "Doar 500 pro DevDojo";
        String naoDoarSalario = "Nao tenho condicoes";

        String resultado = salario < 500 ? doarSalario : naoDoarSalario;

        System.out.println(resultado);



    }


}
