package org.example;

public class Estagiario extends Funcionario {
    private String instEnsino;
    private double bolsaAuxilio;

    public Estagiario(String nome, String cpf, String instEnsino, double bolsaAuxilio) {
        super(nome, cpf);
        this.instEnsino = instEnsino;
        this.bolsaAuxilio = bolsaAuxilio;
    }

    public Estagiario(){}

    public void setInstEnsino(String instEnsino) {
        this.instEnsino = instEnsino;
    }

    public String getInstituicaoEnsino() {
        return this.instEnsino;
    }

    public void setBolsaAuxilio(double bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public double calcularSalario() {
        return this.bolsaAuxilio;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Instituição de Ensino: " + instEnsino +
                "\nBolsa Auxílio: " + bolsaAuxilio);
    }
}
