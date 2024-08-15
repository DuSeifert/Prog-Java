package br.com.unicesumar;

public class Pessoa {
    //Atributos:
    public String nome;
    public int idade;

    //método construtor:
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //métodos:
    public void imprimir(){
        System.out.printf("Olá, meu nome é %s e eu tenho %d anos\n", nome, idade);
    }

    public void comer(String comida){
        System.out.printf("%s está comendo %s", this.nome, comida);
    }


}
