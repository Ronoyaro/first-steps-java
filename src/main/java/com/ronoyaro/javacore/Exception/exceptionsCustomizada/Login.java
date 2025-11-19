package com.ronoyaro.javacore.Exception.exceptionsCustomizada;

import java.util.Scanner;

public class Login {
    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String usuario = "Okarun";
        String senha = "1234";
        System.out.println("Digite o seu usuario");
        String usuarioDigitado = scanner.nextLine();
        System.out.println("Digite sua senha");
        String senhaDigitada = scanner.nextLine();

        if(!usuario.equals(usuarioDigitado) || !senha.equals(senhaDigitada)) {
           throw new LoginInvalidoException();
        }
        System.out.println("Login realizado com sucesso");
    }

    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}
