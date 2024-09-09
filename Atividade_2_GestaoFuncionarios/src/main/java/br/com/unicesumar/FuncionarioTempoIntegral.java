package br.com.unicesumar;

public class FuncionarioTempoIntegral extends Funcionario{
    float bonus;

    public FuncionarioTempoIntegral(String nome, String cpf, float salario, float bonus){
        super(nome, cpf, salario);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public float calcularSalario(){
        return salarioBase + (salarioBase * bonus/100);
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.printf("Bonus: %.1f%%\n", getBonus());
        System.out.printf("Salário: R$%.2f\n", calcularSalario());
    }
}
