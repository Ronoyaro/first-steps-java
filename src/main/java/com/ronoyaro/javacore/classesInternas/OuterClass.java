package com.ronoyaro.javacore.classesInternas;

public class OuterClass {
    private String nome = "Midoriya";

    class innerClass {
        public void printOuterClassAttribute() {
            System.out.println(nome);
            System.out.println(this);
            System.out.println(OuterClass.this);
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        innerClass innerClass = outerClass.new innerClass();
        innerClass.printOuterClassAttribute();
    }

}
