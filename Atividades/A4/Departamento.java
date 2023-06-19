package A4;

import java.util.ArrayList;
import java.util.List;

class Departamento<T extends Funcionario & Ponto> {
    private List<T> funcionarios;
    private List<Gerente> gerentes;

    public Departamento() {
        funcionarios = new ArrayList<>();
        gerentes = new ArrayList<>();
    }

    public void adicionarFuncionario(T funcionario) {
        funcionarios.add(funcionario);
        if (funcionario instanceof Gerente) {
            gerentes.add((Gerente) funcionario);
        }
    }

    public void adicionarGerente(Gerente gerente) {
        gerentes.add(gerente);
    }

    public List<Funcionario> listarFuncionarios() {
        return new ArrayList<>(funcionarios);
    }

    public List<Funcionario> listarAtrasados(String hora) {
        List<Funcionario> atrasados = new ArrayList<>();
        for (T funcionario : funcionarios) {
            if (funcionario.getHoraEntrada().compareTo(hora) > 0) {
                atrasados.add(funcionario);
            }
        }
        return atrasados;
    }

    public void adicionarFuncionario(Gerente gerente1) {}

    public void adicionarFuncionario(Analista analista1) {}
}