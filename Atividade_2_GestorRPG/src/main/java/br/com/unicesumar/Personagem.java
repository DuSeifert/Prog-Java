package br.com.unicesumar;

public class Personagem {

    String nome;
    int hp;
    int atk;
    int def;

    public Personagem(String nome, int hp, int atk, int def) {
        this.nome = nome;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public void atacar(Personagem inimigo) {
        System.out.println(this.nome +" ataca "+ inimigo.nome);
        if(inimigo.def < this.atk){
            inimigo.receberDano(this.atk);
            System.out.println("   Acerto!");
        }
        else{
            System.out.println("   Bloqueado!");
        }
    }

    public void receberDano(int dano){
            this.hp -= dano;
    }

    public boolean estaVivo(){
        return this.hp > 0;
    }

}
