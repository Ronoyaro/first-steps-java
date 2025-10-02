package com.ronoyaro.javacore.wrappers;

public class WrapperTest {

    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'R';
        boolean booleanP = false;


        //Autoboxing - pega um valor primitivo e transforma numa classe do seu tipo

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'R';
        Boolean booleanW = false;

        //Unboxing - Desaclopa da classe e transforma num tipo primitivo

        byte newByteP = byteW;
        short newShortP = shortW;
        int newIntP = intW;
        long newLongP = longW;
        double newDoubleP = doubleW;
        float newFloatP = floatW;
        char newCharP = charW;
        boolean newBooleanP = booleanW;

        Integer intString = Integer.parseInt("1"); //String p numero
        System.out.println(Character.isLetterOrDigit(charW)); //True
        System.out.println(Character.isUpperCase(charW));
        System.out.println(Character.toLowerCase(charW));
        System.out.println(charW);

    }

}
