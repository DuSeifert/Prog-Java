package br.com.unicesumar;

public class Guerreiro extends Personagem{

    int forca_extra;
    int armadura;

    public Guerreiro(String nome, int hp, int atk, int def, int forc_ext, int armadura) {
        super(nome, hp, atk, def+armadura);
        this.forca_extra = forc_ext;
        this.armadura = armadura;
    }



    //todo: mandar o vini tomar no cu


}
