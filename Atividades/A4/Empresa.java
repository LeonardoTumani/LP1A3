package A4;

import java.util.List;

public class Empresa {
    public static void main(String[] args) {
        Departamento<Programador> departamento = new Departamento<>();

        Gerente gerente1 = new Gerente("João", 1, 5000.0);
        Programador programador1 = new Programador("Carlos", 2, 3000.0);
        Programador programador2 = new Programador("Ana", 3, 3500.0);
        Analista analista1 = new Analista("Maria", 4, 4000.0);

        departamento.adicionarFuncionario(gerente1);
        departamento.adicionarFuncionario(programador1);
        departamento.adicionarFuncionario(programador2);
        departamento.adicionarFuncionario(analista1);

        programador1.entrada("09:00");
        programador1.saida("18:00");

        programador2.entrada("09:15");
        programador2.saida("17:30");

        analista1.entrada("08:45");
        analista1.saida("17:45");

        List<Funcionario> listaFuncionarios = departamento.listarFuncionarios();
        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println("Nome: " + funcionario.getNome() + ", ID: " + funcionario.getId() + ", Salário: " + funcionario.getSalario());
        }

        System.out.println();

        List<Funcionario> atrasados = departamento.listarAtrasados("09:00");
        for (Funcionario funcionario : atrasados) {
            System.out.println("Funcionário atrasado: " + funcionario.getNome());
        }
    }
}
