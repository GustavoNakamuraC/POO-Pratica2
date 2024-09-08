package org.example;

public class Mago extends Personagem{
    int mana;
    private int poderMagico;
    private int classe;

    public Mago(String nome, int nivel, int hp, int atk, int def,int mana, int poderMagico) {
        super(nome, nivel, hp, atk, def);
        this.mana = mana;
        this.poderMagico = poderMagico;
        this.classe = 3;
    }

    public int getClasse() {
        return classe;
    }

    public Mago() {
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }

    public void lancarMagia(Personagem inimigo){
        if(mana >= 10){
            inimigo.receberDano(this.poderMagico - inimigo.getDef());
            this.mana -= 10;
        }
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.print("/ Mana: " + mana +
                "/ Poder Mágico: " + poderMagico + " /");

    }
}
