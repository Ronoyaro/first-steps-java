package com.ronoyaro.introducao;

public class ArraysMultidimensional {
    public static void main(String[] args) {
        int[][] dias = new int[2][3];
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;

        dias[1][0] = 1;
        dias[1][1] = 2;
        dias[1][2] = 3;

        for (int[] dia : dias) {
            for (int num : dia) {
                System.out.println(num);
            }
        }
        for (int[] dia : dias) {
            System.out.println(dia[0]);
        }

        int[][] arrayNum2 = new int[2][];

        arrayNum2[0] = new int[3];
        arrayNum2[1] = new int[4];

    }
}


