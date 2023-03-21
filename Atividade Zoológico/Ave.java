package com.company;

public class Ave extends Animal {
    private String tipoBico;

    public Ave (String nome, int idade, String especie, boolean alimentado, String tipoBico) {
        super(nome, idade, especie, alimentado);
        this.tipoBico = tipoBico;
    }

    public void emitirSom() {
        System.out.println("Som de ave.");
    }

    public void alimentar() {
        setAlimentado(true);
    }
}