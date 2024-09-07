package br.com.unicesumar;

public class Estagiario extends Funcionario{
    String instituicaoEnsino;
    float bolsaAuxilio;

    public Estagiario(String nome, String cpf, String instituicaoEnsino, float bolsaAuxilio) {
        super(nome, cpf, 0);
        this.instituicaoEnsino = instituicaoEnsino;
        this.bolsaAuxilio = bolsaAuxilio;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public float getBolsaAuxilio() {
        return bolsaAuxilio;
    }

    public void setBolsaAuxilio(float bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public float calcularSalario(){
        return bolsaAuxilio;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        //System.out.println("Salario Base: " + getSalarioBase());
        System.out.println("Bolsa auxílio: " + getBolsaAuxilio());
        System.out.println("Instituição de Ensino: " + getInstituicaoEnsino());
    }

}
