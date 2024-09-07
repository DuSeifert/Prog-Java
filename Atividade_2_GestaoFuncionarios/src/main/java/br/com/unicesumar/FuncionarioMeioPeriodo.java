package br.com.unicesumar;

public class FuncionarioMeioPeriodo extends Funcionario {

    float horasTrabalhadas;
    float valorHora;

    public FuncionarioMeioPeriodo(String nome, String cpf, float horasTrabalhadas, float valorHora) {
        super(nome, cpf, 0);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public float calcularSalario(){
        return horasTrabalhadas * valorHora;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        //System.out.println("Salario Base: " + getSalarioBase());
        System.out.println("Horas trabalhadas: " + getHorasTrabalhadas());
        System.out.println("Valor da hora: " + getValorHora());
    }
}
