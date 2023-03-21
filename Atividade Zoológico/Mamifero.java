package com.company;

public class Mamifero extends Animal {
    private int tempoGestacao;

    public Mamifero (String nome, int idade, String especie, boolean alimentado, int tempoGestacao) {
        super(nome, idade, especie, alimentado);
        this.tempoGestacao = tempoGestacao;
    }

    public void emitirSom() {
        System.out.println("Som de mamifero.");
    }

    public void alimentar() {
        setAlimentado(true);
    }
}