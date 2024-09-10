package br.com.unicesumar;

public class Personagem {

    public String nome;
    public int nivel;
    public int hp;
    public int atk;
    public int def;

    public Personagem(String nome, int nivel, int hp, int atk, int def) {
        this.nome = nome;
        this.nivel = nivel;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public String getNome(){
        return nome;
    }

    public int getNivel(){
        return nivel;
    }

    public int getHp(){
        return hp;
    }

    public int getAtk(){
        return atk;
    }

    public int getDef(){
        return def;
    }

    public void atacar(Personagem inimigo) {
        int dano = calcDano(this.atk, inimigo.def);
        inimigo.receberDano(dano);
        System.out.println(this.nome+" ataca "+inimigo.nome+", causando "+dano+" de dano");
    }

    public boolean estaVivo(){
        return this.hp > 0;
    }

    public int calcDano(int atk, int def){
        int dano = atk - def;
        return Math.max(dano, 0);
    }

    public void receberDano(int dano){
        this.hp -= dano;
        if(this.hp < 0) this.hp = 0;

        System.out.println(this.nome+" agora tem "+ this.hp+" de vida");
    }

    public void exibirStatus(){
            System.out.println("Nome: " + getNome());
            System.out.println("Nivel: " + getNivel());
            System.out.println("HP: " + getHp());
            System.out.println("Atk: " + getAtk());
            System.out.println("Def: " + getDef());
    }
}
