package org.example;

public class ContaBancaria {

    String titular;
    int numConta;
    double saldo;

    public ContaBancaria(String titular, int numConta, double saldo) {
        this.titular = titular;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    void getTitular(){
        System.out.printf("Titular da conta: %s", this.titular);
    }

    void getNumConta(){
        System.out.printf("Numero de conta: %d", this.numConta);
    }

    void getSaldo(){
        System.out.printf("Saldo da conta: R$%.2f", this.saldo);
    }

    void depositar(double valor){
        this.saldo += valor;
    }

    boolean sacar(double valor){
        if(this.saldo > valor){
            this.saldo -= valor;
            return true;
        }
        else {
            return false;
        }
    }

    void detalhes(){
        System.out.printf("        Titular: %s\nNumero de conta: %d\n          Saldo: R$%.2f", this.titular, this.numConta, this.saldo);
    }
}
