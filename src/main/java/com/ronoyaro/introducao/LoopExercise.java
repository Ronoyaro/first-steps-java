package com.ronoyaro.introducao;


//Dado valor de um carro, descubra em quantas vezes ele pode
//ser parcelado, valorParcela >= 1000;

public class LoopExercise {
    public static void main(String[] args) {
        for (int count = 0; count <= 10; count++) {
            if (count % 2 == 0) {
                System.out.println(count);
            }
        }
        double valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            System.out.println("parcela de " +parcela+ "x no valor de: " +valorParcela);
            if (valorParcela <= 1000) {
                break;
            }
        }
    }

}



