package com.company;

public class Main {

    public static void main(String[] args) {
        /* Criação de objeto atraves do construtor
        * não paramentrizado*/
        Heroi batman = new Heroi();
        batman.setNomeHeroi("Batman");
        batman.setPeso(81.5);
        batman.setForcaAtaque(900);
        batman.imprimirAtributos();

        Heroi superman = new Heroi();
        superman.setNomeHeroi("Super Homen");
        superman.setPeso(79.2);
        superman.setForcaAtaque(10000);
        superman.imprimirAtributos();

    }
}
