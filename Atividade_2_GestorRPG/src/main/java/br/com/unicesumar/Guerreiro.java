package br.com.unicesumar;

public class Guerreiro extends Personagem{

    public int forcaExtra;
    public int armadura;

    public Guerreiro(String nome, int nivel, int hp, int atk, int def, int forc_ext, int armadura) {
        super(nome, nivel, hp, atk, def);
        this.forcaExtra = forc_ext;
        this.armadura = armadura;
    }

    public int getForcaExtra(){
        return forcaExtra;
    }

    public int getArmadura(){
        return armadura;
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = calcDano(this.atk + this.forcaExtra, inimigo.def);
        inimigo.receberDano(dano);
        System.out.println(this.nome + " (Guerreiro) atacou " + inimigo.nome + " com força extra, causando " + dano + " de dano.");
    }

    @Override
    public void exibirStatus(){

        System.out.println("Classe: Guerreiro");
        super.exibirStatus();
        System.out.println("Forca: " + getForcaExtra());
        System.out.println("Armadura: " + getArmadura());

    }


}
