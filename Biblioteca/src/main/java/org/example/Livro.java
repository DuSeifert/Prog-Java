package org.example;

public class Livro {

    //atributos

    private String titulo;
    private String autor;
    private String anoPub;
    private boolean disponvel;

    public Livro(String titulo, String autor, String anoPub) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPub = anoPub;
        this.disponvel = true;
    }

    public String getTitulo() {
        return this.titulo;
    }


}
