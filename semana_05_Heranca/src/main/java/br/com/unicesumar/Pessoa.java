package br.com.unicesumar;

public class Pessoa {
    private String nome;
    private int registro;
    private String endereco;

    public Pessoa(String nome, int registro, String endereco) {
        this.nome = nome;
        this.registro = registro;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getRegistro() {
        return registro;
    }

    public String getEndereco() {
        return endereco;
    }
}