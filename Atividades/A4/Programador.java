package A4;

class Programador extends Funcionario implements Ponto {
    public Programador(String nome, int id, double salario) {
        super(nome, id, salario);
    }

    @Override
    public void entrada(String hora) {
        setHoraEntrada(hora);
    }

    @Override
    public void saida(String hora) {
        setHoraSaida(hora);
    }
}