package org.example;

public class Arqueiro extends Personagem{
    private int precisao;
    private int alcance;
    private int classe;

    public Arqueiro(String nome, int nivel, int hp, int atk, int def, int precisao, int alcance) {
        super(nome, nivel, hp, atk, def);
        this.precisao = precisao;
        this.alcance = alcance;
        this.classe = 1;
    }

    public Arqueiro() {
    }

    public int getPrecisao() {
        return precisao;
    }

    public void setPrecisao(int precisao) {
        this.precisao = precisao;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getClasse() {
        return classe;
    }

    public void atirarFlecha(Personagem inimigo) {
        inimigo.receberDano((this.getAtk() + this.precisao) - inimigo.getDef());
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.print("/ Precisão: " + precisao +
                "/ Alcance: " + alcance + " /");
    }
}
