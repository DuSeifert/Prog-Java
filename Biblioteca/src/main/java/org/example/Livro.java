package org.example;

public class Livro {

    //atributos

    private String titulo;
    private String autor;
    private String anoPub;
    private boolean disponvel;

    //construtor
    public Livro(String titulo, String autor, String anoPub) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPub = anoPub;
        this.disponvel = true;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public String getAnoPub(){
        return this.anoPub;
    }

    public boolean getDisponivel(){
        if(this.disponvel){
            return true;
        }
        else {
            return false;
        }
    }

    public void emprestar(){
        if(this.disponvel){
            this.disponvel = false;
            System.out.printf("Livro '%s' emprestado\n", this.titulo);
        }
        else{
            System.out.printf("'%s' não disponível para empréstimo\n", this.titulo);
        }
    }

    public void devolver(){
        if(this.disponvel){
            System.out.printf("Livro '%s' não está emprestado\n", this.titulo);
        }
        else {
            this.disponvel = true;
            System.out.printf("Livro '%s' devolvido\n", this.titulo);
        }
    }

    public void descricao(){
        System.out.printf("             Nome:  %s\n            Autor:  %s\nAno de publicação:  %s\n", this.titulo, this.autor, this.anoPub);
        if(this.disponvel){
            System.out.print("       Disponível:  Sim\n\n");
        }
        else{
            System.out.print("       Disponível:  Não\n\n");
        }
    }
}
