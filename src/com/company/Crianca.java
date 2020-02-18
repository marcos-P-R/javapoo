package com.company;

public class Crianca {
    // atributo
    String corCabelo;
    String corPele;
    double altura;
    int idade;

    //metodos e funções

    void brincar(){
        System.out.println("Bricando...");
    }
    void correr(double m) {
        System.out.println("Correndo " + m + " metros");
    }
    void nadar(double m){
        System.out.println("Nadando por " + m + " metros");
    }

    String sorrir(){
        return ";)";
    }

}//fim da classe Criança
