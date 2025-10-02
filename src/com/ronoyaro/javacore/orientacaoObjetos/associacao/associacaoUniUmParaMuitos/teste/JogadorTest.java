package com.ronoyaro.javacore.orientacaoObjetos.associacao.associacaoUniUmParaMuitos.teste;

import com.ronoyaro.javacore.orientacaoObjetos.associacao.associacaoUniUmParaMuitos.dominio.Jogador;
import com.ronoyaro.javacore.orientacaoObjetos.associacao.associacaoUniUmParaMuitos.dominio.Time;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Everton Ribeiro");
        Time time =  new Time("Bahia");

        jogador.setTime(time);

        jogador.imprime();
    }
}
