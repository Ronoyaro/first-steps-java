package com.ronoyaro.javacore.Exception.test;

public class RuntimeExceptionTest3 {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Ultimo mais generico");
        }
    }
}
