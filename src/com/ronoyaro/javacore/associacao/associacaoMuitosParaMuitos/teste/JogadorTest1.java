package com.ronoyaro.javacore.associacao.associacaoMuitosParaMuitos.teste;

import com.ronoyaro.javacore.associacao.associacaoMuitosParaMuitos.dominio.Jogador;
import com.ronoyaro.javacore.associacao.associacaoMuitosParaMuitos.dominio.Time;

public class JogadorTest1 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Everton Ribeiro");
        Jogador jogador2 = new Jogador("Cauly");
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2};

        Time time = new Time("Bahia");

        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        jogador1.imprime();
        System.out.println("--------------");
        jogador2.imprime();
        System.out.println("--------------");
        time.imprime();
    }
}
