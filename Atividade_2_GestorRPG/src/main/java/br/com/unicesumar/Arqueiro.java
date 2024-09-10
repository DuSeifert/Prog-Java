package br.com.unicesumar;

public class Arqueiro extends Personagem{

    public int precisao;
    public int alcance;

    public Arqueiro(String nome, int nivel, int hp, int atk, int def, int precisao, int alcance) {
        super(nome, nivel, hp, atk, def);
        this.precisao = precisao;
        this.alcance = alcance;
    }

    public int getPrecisao(){
        return precisao;
    }

    public int getAlcance(){
        return alcance;
    }

    public void atirarFlecha(Personagem inimigo) {
        int dano = calcDano(this.atk + this.precisao, inimigo.def);
        inimigo.receberDano(dano);
        System.out.println(this.nome + " (Arqueiro) atirou uma flecha em " + inimigo.nome + " causando " + dano + " de dano.");
    }

    @Override
    public void exibirStatus(){

        System.out.println("Classe: Arqueiro");
        super.exibirStatus();
        System.out.println("Precisão: " + getPrecisao());
        System.out.println("Alcance: " + getAlcance());

    }


}
