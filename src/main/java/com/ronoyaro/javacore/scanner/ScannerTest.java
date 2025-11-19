package com.ronoyaro.javacore.scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        String text = "Misaka,Eren,Armin,200";
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            if(scanner.hasNextInt()) {
                System.out.println(scanner.nextInt());
            } else {
                scanner.next();
            }
        }
    }
}
