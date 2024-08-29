package org.example;

public class ContaBancaria {

    private String titular;
    private int numConta;
    private double saldo;

    public ContaBancaria(String titular, int numConta, double saldo) {
        this.titular = titular;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }

    public int getNumConta(){
        return numConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.printf("Deposito de R$%.2f realizado\n", valor);
        }
        else{
            System.out.println("Valor de depósito inválido");
        }
    }

    boolean sacar(double valor){
        if(saldo > valor){
            saldo -= valor;
            return true;
        }
        else {
            return false;
        }
    }

    void detalhes(){
        System.out.printf("        Titular: %s\nNumero de conta: %d\n          Saldo: R$%.2f", titular, numConta, saldo);
    }
}
