package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //criar a conta com os dados: Nome, número da conta, saldo inicial

        ContaBancaria conta = criarConta();
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\nConta criada com sucesso:\n");
        conta.detalhes();
        continuar();

        //entrar no caixa eletrônico

        boolean cont;
        CaixaEletronico caixa = new CaixaEletronico();

        do {
            System.out.print("\n\nTerminal eletrônico:\n\n");
            cont = caixa.menu(conta);

        } while (cont);

        System.out.print("\n\nObrigado por usar o Banco Do Pobre\n");
        sc.close();
    }

    //------------------------------------------------------------------------//

    static ContaBancaria criarConta() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre o nome do titular da conta: ");
        String nome = sc.nextLine();

        System.out.print("Entre o saldo da conta: R$");
        double saldo = sc.nextDouble();
        sc.nextLine();

        Random rand = new Random();
        int nConta = rand.nextInt(999);

        return new ContaBancaria(nome, nConta, saldo);
    }

    static void continuar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nAperte qualquer tecla para continuar: ");
        char c = sc.next().charAt(0);
    }
}