package br.com.sistemadebanco.model;

public class ControleDeHoras {
    private double horaEntrada;
    private double horaSaida;
    private double resultado;

    public ControleDeHoras(double horaEntrada, double horaSaida) {
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    public double getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(double horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public double getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(double horaSaida) {
        this.horaSaida = horaSaida;
    }

    public double getResultado() {


        return horaEntrada - horaSaida;
    }



    @Override
    public String toString() {
        String resultado = """
                Você começou o seu projeto às %d
                e e terminou às %d
                o tempo que você levou foi %d
                """;
        return System.out.format(resultado, this.horaEntrada, this.horaSaida, this.resultado).toString();
    }
}
