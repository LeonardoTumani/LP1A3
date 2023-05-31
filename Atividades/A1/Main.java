package A1;

public class Main {

    public static void main(String[] args) {
        System.out.println ("\nZoológico iniciado.\n");

        Mamifero Lobisomem = new Mamifero("Lupin", 30, "Lobisomem", false, 90);
        Ave Hipogrifo = new Ave("Bicuço", 50, "Hipogrifo", true, "bico curvado");
        Reptil Dragao = new Reptil("Esquentadinho", 100, "Barriga-de-ferro Ucraniano", false, 90);

        Zoologico Hogwarts = new Zoologico();

        Hogwarts.adicionarAnimal(Lobisomem);
        Hogwarts.adicionarAnimal(Hipogrifo);
        Hogwarts.adicionarAnimal(Dragao);

        Hogwarts.listarAnimais();
        Hogwarts.alimentarAnimais();
    }
}
