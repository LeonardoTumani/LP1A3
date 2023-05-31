package A1;

public abstract class Animal implements Alimentavel {
    private String nome;
    private int idade;
    private String especie;
    private boolean alimentado;

    public Animal (String nome, int idade, String especie, boolean alimentado) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.alimentado = alimentado;
    }

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public void setAlimentado(boolean alimentado) {
        this.alimentado = alimentado;
    }
}