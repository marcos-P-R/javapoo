package com.company;

public class Main {

    public static void main(String[] args) {
	    //Criando um objeto da classe Crianca

        Crianca c1 = new Crianca(); //eh um obj
        Crianca c2; //uma variavel

        c1.corCabelo = "Ruivo";
        c1.altura = 1.20;
        c1.idade = 5;

        System.out.println(c1.corCabelo);
        System.out.println(c1.altura);
        System.out.println(c1.idade);

        c1.brincar();
        c1.correr(2.1);
        c1.nadar(0.87);
        System.out.println( c1.sorrir());

        //Classe GuardaSol

        GuardaSol g1 = new GuardaSol();
        g1.cor = "Vermelho";
        g1.peso = 2.5;
        g1.fechado = true;

        g1.abrir();
        g1.abrir();
        g1.fechar();
        g1.fechar();

    }//fim do main
}// fim da clase
