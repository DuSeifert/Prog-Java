package br.com.unicesumar;

public class Funcionario {
    String nome;
    String cpf;
    float salarioBase;

    public Funcionario(String nome, String cpf, float sal_base) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = sal_base;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float calcularSalario() {
        return salarioBase;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.printf("Salário: R$%.2f\n", calcularSalario());
    }

}
