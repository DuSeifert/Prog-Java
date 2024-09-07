package br.com.unicesumar;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private List<Professor> professores;

    public Aluno(String nome, int registro, String endereco) {
        super(nome, registro, endereco);
        this.professores = new ArrayList<>();
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void addProfessor(Professor prof) {
        this.professores.add(prof);
    }

}