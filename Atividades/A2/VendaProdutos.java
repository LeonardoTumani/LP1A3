package A2;

import java.util.ArrayList;
import java.util.List;

public class VendaProdutos {
    private static List<Produto> listaProdutos = new ArrayList<>();

    public static void main(String[] args) {
        listaProdutos.add(new Produto("Chocolate", 10.0));
        listaProdutos.add(new Produto("Nescau", 15.0));
        listaProdutos.add(new Produto("Toddy", 20.0));

        try {
            venderProduto("Chocolate", 15.0);
            venderProduto("Toddy", 18.0);
            venderProduto("Nesquik", 25.0);
        } catch (Exception e) {
            System.out.println("Erro na venda do produto: " + e.getMessage());
        }

        exibirListaProdutos();
    }

    private static void venderProduto(String nome, double valor) throws Exception {
        Produto produtoVendido = null;
        for (Produto produto : listaProdutos) {
            if (produto.getNome().equals(nome)) {
                produtoVendido = produto;
                break;
            }
        }

        if (produtoVendido == null) {
            throw new Exception("Produto não encontrado na lista.");
        }

        if (valor < produtoVendido.getPreco()) {
            throw new Exception("Valor informado é menor que o preço do produto.");
        }

        System.out.println("Venda realizada: " + produtoVendido.getNome());
    }

    private static void exibirListaProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("A lista de produtos está vazia.");
        } else {
            System.out.println("Lista de produtos:");
            for (Produto produto : listaProdutos) {
                System.out.println(produto.getNome() + " - R$" + produto.getPreco());
            }
        }
    }
}
