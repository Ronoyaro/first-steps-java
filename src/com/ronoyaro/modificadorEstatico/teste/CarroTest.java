package com.ronoyaro.modificadorEstatico.teste;

import com.ronoyaro.modificadorEstatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args){

        Carro carro1 = new Carro();
        //Metodos nao-estaticos precisam que os objetos sejam criados
        carro1.setMarca("Mercedes");
        carro1.setVelocidadeMaxima(280);

        Carro.setVelocidadeLimite(180); //Setando valor atraves de um metodo estatico
        System.out.println(Carro.getVelocidadeLimite()); //Chamando o valor atraves de um metodo estatico

    }
}
