package org.example;

public class FuncionarioMeioPeriodo extends Funcionario{
    private int horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioMeioPeriodo(String nome, String cpf, int horasTrabalhadas, double valorPorHora) {
        super(nome, cpf, 0);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public FuncionarioMeioPeriodo() {}

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Horas trabalhadas: " + horasTrabalhadas +
                "\nValor por hora: " + valorPorHora +
                "\nSalário: " + calcularSalario());
    }
}