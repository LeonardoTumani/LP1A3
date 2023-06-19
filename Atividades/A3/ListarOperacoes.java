package A3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListarOperacoes {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new LinkedList<>();

        try {
            adicionarElemento(list1, "Elemento 1");
            adicionarElemento(list1, "Elemento 2");
            adicionarElemento(list2, "Elemento 3");
            adicionarElemento(list2, "Elemento 4");
            adicionarElemento(list3, "Elemento 5");
            adicionarElemento(list3, "Elemento 6");
        } catch (NumberFormatException e) {
            System.out.println("Erro: o elemento digitado deve ser um número válido.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        list1.addAll(list2);
        list1.addAll(list3);

        System.out.println("O elemento 'Elemento 3' está presente na lista 1? " + list1.contains("Elemento 3"));

        boolean allInList1 = list1.containsAll(list3);
        System.out.println("Todos os elementos da lista 3 estão presentes na lista 1? " + allInList1);

        boolean list1EqualsList2 = list1.equals(list2);
        System.out.println("A lista 1 é igual à lista 2? " + list1EqualsList2);

        System.out.println("Elemento 2 da lista 1: " + list1.get(1));
        System.out.println("Elemento 2 da lista 2: " + list2.get(1));
        System.out.println("Elemento 2 da lista 3: " + list3.get(1));

        list3.remove(0);

        list1.removeAll(list3);

        int list1Size = list1.size();
        System.out.println("Tamanho da lista 1: " + list1Size);

        list3.clear();

        boolean list3IsEmpty = list3.isEmpty();
        System.out.println("A lista 3 está vazia? " + list3IsEmpty);

        System.out.println("Elementos da lista 1:");
        for (String element : list1) {
            System.out.println(element);
        }
    }

    private static void adicionarElemento(List<String> lista, String texto) throws Exception {
        if (!texto.matches(".*\\d.*")) {
            throw new NumberFormatException();
        }

        lista.add(texto);
    }
}

