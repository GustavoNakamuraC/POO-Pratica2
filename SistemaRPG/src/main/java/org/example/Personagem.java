package org.example;

public class Personagem {
    private String nome;
    private int nivel;
     int hp;
    private int atk;
    private int def;

    public Personagem(String nome, int nivel, int hp, int atk, int def) {
        this.nome = nome;
        this.nivel = nivel;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public Personagem() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void atacar(Personagem defensor){
        defensor.receberDano(atk - defensor.getDef());
    }

    public void receberDano(int dano){
        this.hp -= (dano);
    }

    public void exibirStatus(){

    }

    public boolean estaVivo(){
        if (hp > 0){
            return true;
        }else{
            return false;
        }
    }
}
