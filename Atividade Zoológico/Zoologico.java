package com.company;
import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> listaAnimais = new ArrayList<>();

    public void adicionarAnimal (Animal animal) {
        listaAnimais.add (animal);
    }

    public void listarAnimais() {
        for(Animal cada: listaAnimais){
            System.out.println ("- " + cada.getNome() + ";");
        }
    }

    public void alimentarAnimais() {
        for(Animal cada: listaAnimais) {
            cada.alimentar();
        }

        System.out.println("\nOs animais foram alimentados.");
    }
}