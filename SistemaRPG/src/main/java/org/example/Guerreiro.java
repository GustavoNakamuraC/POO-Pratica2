package org.example;

public class Guerreiro extends Personagem{
    private int forcaExtra;
    private int armadura;
    private int classe;

    public Guerreiro(String nome, int nivel, int hp, int atk, int def, int forcaExtra, int armadura) {
        super(nome, nivel, hp, atk, def);
        this.forcaExtra = forcaExtra;
        this.armadura = armadura;
        this.classe = 2;
    }

    public Guerreiro() {
    }

    public int getClasse() {
        return classe;
    }

    public int getForcaExtra() {
        return forcaExtra;
    }

    public void setForcaExtra(int forcaExtra) {
        this.forcaExtra = forcaExtra;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    @Override
    public void atacar(Personagem defensor) {
        defensor.receberDano((this.getAtk() + this.forcaExtra) - defensor.getDef());
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.print("/ Força extra: " + forcaExtra +
                "/ Armadura: " + armadura + " /");
    }
}
