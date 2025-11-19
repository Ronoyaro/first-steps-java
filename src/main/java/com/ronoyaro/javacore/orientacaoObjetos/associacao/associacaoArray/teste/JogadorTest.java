package com.ronoyaro.javacore.orientacaoObjetos.associacao.associacaoArray.teste;

import com.ronoyaro.javacore.orientacaoObjetos.associacao.associacaoArray.dominio.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Caio Alexandre");
        Jogador jogador2 = new Jogador("Cauly");
        Jogador jogador3 = new Jogador("Everton Ribeiro");

        Jogador[] jogadorArray = new Jogador[]{jogador1, jogador2, jogador3};

        for (Jogador jogador: jogadorArray){
            jogador.imprime();
        }

    }
}
