package A1;

public class Reptil extends Animal {
    private double temperaturaCorporal;

    public Reptil (String nome, int idade, String especie, boolean alimentado, double temperaturaCorporal) {
        super(nome, idade, especie, alimentado);
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public void emitirSom() {
        System.out.println("Som de reptil.");
    }

    public void alimentar() {
        setAlimentado(true);
    }
}