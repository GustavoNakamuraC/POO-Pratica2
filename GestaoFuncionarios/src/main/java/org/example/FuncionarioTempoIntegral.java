package org.example;

public class FuncionarioTempoIntegral extends Funcionario{
    private double bonus;


    public FuncionarioTempoIntegral(String nome, String cpf, double salBase, double bonus) {
        super(nome, cpf, salBase);
        this.bonus = bonus;
    }

    public FuncionarioTempoIntegral() {
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salBase * ((100 + bonus) / 100);
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Salario base: " + salBase +
                "\nBonus: " + bonus);
    }
}
