package br.com.unicesumar;

public class Studeo {
    public static void main(String[] args) {

        Aluno Eduardo = new Aluno("Eduardo", 123456, "Maringa");
        Professor Choma = new Professor("Choma", 654321, "Maringa");

        System.out.println("Qual aluno?: "+ Eduardo.getNome());

        Eduardo.addProfessor(Choma);

        System.out.println("Qual são os professores?: " + Eduardo.getProfessores().get(0).getNome());

    }
}