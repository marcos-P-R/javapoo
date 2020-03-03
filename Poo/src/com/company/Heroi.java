package com.company;

public class Heroi {
    // 3 atributos
    private double forcaAtaque;
    private String nomeHeroi;
    private double peso;

    // 1 metodo
    double atacar(){
        if (this.peso > 100){
            return 50.50;
        }else{
            return 25.25;
        }
    } // fim de classe

    // construtor não paramentrizado:
    Heroi(){
        System.out.println("Criando um objeto através do construtor não paramentrizado");
    }

    // construtor paramentrizado:
    Heroi(String nome, double peso, double forca){
        this.nomeHeroi = nome;
        this.peso = peso;
        this.forcaAtaque = forca;
    }

    void imprimirAtributos(){
        System.out.println("#####################");
        System.out.println("Nome: " +this.nomeHeroi);
        System.out.println("Peso: " +this.peso);
        System.out.println("Força de ataque: " +this.forcaAtaque);
    } //Fim do imprimir

    public void setNomeHeroi(String nomeHeroi){
        if (nomeHeroi.length() >= 1 && nomeHeroi.length() <= 100){
            this.nomeHeroi = nomeHeroi;
        }else {
            System.out.println("Erro! Nome inválido, precisa conter no mínimo um caracter e no máximo 100 caracteres");
            System.exit(0); //encerra o programa!
        }
    } //Fim do setNome

    public String getNomeHeroi(){
        return this.nomeHeroi;
    }

    public void setPeso(double peso){
        if (peso > 0){
            this.peso = peso;
        }else {
            System.out.println("Erro! O peso precisa ser maior que zero");
            System.exit(0);
        }
    } //Fim do setPeso
    public double getPeso(){
        return this.peso;
    }

    public void setForcaAtaque(double forcaAtaque) {
        if (forcaAtaque > 0) {
            this.forcaAtaque = forcaAtaque;
        } else {
            System.err.println("Erro! Força precisa ser maior que zero");
            System.exit(0);
        }
    }

    public double getForcaAtaque() {
        return forcaAtaque;
    }


} // fim da classe
