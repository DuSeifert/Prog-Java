package br.com.unicesumar;

public class Mago extends Personagem{
    public int mana;
    public int poderMagico;

    public Mago(String nome, int nivel, int hp, int atk, int def, int mana, int poderMagico) {
        super(nome, nivel, hp, atk, def);
        this.mana = mana;
        this.poderMagico = poderMagico;
    }

    public int getMana(){
        return mana;
    }

    public int getPoderMagico(){
        return poderMagico;
    }

    public void lancarMagia(Personagem inimigo) {
        if (this.mana >= 10) {
            int dano = calcDano(this.poderMagico, inimigo.def);
            inimigo.receberDano(dano);
            this.mana -= 10;
            System.out.println(this.nome + " (Mago) lançou uma magia em " + inimigo.nome + " causando " + dano + " de dano.");
            System.out.println(this.nome + " agora tem " + this.mana + " pontos de mana.");
        } else {
            System.out.println(this.nome + " não tem mana suficiente para lançar uma magia.");
        }
    }

    @Override
    public void exibirStatus(){

        System.out.println("Classe: Mago");
        super.exibirStatus();
        System.out.println("Mana: " + getMana());
        System.out.println("Poder Mágico: " + getPoderMagico());

    }

}
