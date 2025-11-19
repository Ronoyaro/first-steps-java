package com.ronoyaro.introducao;

public class SwitchExercise {
    public static void main(String[] args) {
        int diaUtil = 1;
        switch (diaUtil) {
            case 1:
                System.out.println("Domingo - Fim de semana");
                break;
            case 2:
                System.out.println("Segunda - Dia util");
                break;
            case 3:
                System.out.println("Terca - Dia util");
                break;
            case 4:
                System.out.println("Quarta - Dia util");
                break;
            case 5:
                System.out.println("Quinta - Dia util");
                break;
            case 6:
                System.out.println("Sexta - Dia util");
                break;
            case 7:
                System.out.println("Sabado - Fim de semana");
                break;
            default:
                System.out.println("Impossivel");
                break;
        }
    }
}

