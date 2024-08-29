package br.com.unicesumar;

public class Tarefa {
    String nome;
    String prazo;
    boolean status;

    public Tarefa(String nome, String prazo) {
        this.nome = nome;
        this.prazo = prazo;
        this.status = false;
    }

    public String getNome() {
        return nome;
    }

    public String getPrazo(){
        return prazo;
    }

    public boolean isConcluida() {
        return status;
    }

    public void concluirTarefa(){
        status = true;
    }

    public void alterarPrazo(String newPrazo){
        prazo = newPrazo;
    }
}
