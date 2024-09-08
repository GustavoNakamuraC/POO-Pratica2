package org.example;

public class Funcionario {
    private String nome;
    private String cpf;
    public double salBase;

    public Funcionario(String nome, String cpf, double salBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salBase = salBase;
    }

    public Funcionario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public Funcionario(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salBase;
    }

    public void setSalarioBase(double salBase) {
        this.salBase = salBase;
    }

    public double calcularSalario() {
        return this.salBase;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome +
                "\nCPF: " + cpf);
    }
}
