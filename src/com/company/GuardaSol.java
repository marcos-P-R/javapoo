package com.company;

public class GuardaSol {
    String cor;
    double peso;
    String marca;
    boolean fechado;

    void abrir(){
        if ( fechado == true){
            System.out.println("Abrindo guarda sol");
            fechado = false;
        }else{
            System.out.println("Guarda sol ja esta aberto");
        }
    }
    void fechar(){
        if (fechado == false){
            System.out.println("Fechando guarda sol");
            fechado = true;
        }else {
            System.out.println("Guarda sol ja esta fechado");
        }

    }
}
