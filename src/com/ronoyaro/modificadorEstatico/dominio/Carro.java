package com.ronoyaro.modificadorEstatico.dominio;

public class Carro {
    private String marca;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    //Metodos estaticos só podem acessar variaveis de contexto estáticos
    //Pois a gente esta falando diretamente com a classe, sem a necessidade de criar uma instancia

    //Metodos estaticos nao precisam de uma instancia, voce pode chamar diretamente
    //Sem a necessidade de criar um objeto a partir da classe


    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
            Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite; //nao se usa o this, pois estamos falando com a classe
    }



    /*   public static String getMarca(){
        return marca; //Erro pois o marca nao é um valor estatico
    }*/
}
