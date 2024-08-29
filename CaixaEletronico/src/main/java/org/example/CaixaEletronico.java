package org.example;

import java.util.Scanner;

public class CaixaEletronico {

    boolean menu(ContaBancaria conta){
        Scanner sc = new Scanner(System.in);
        char opc;
        double valor;

        System.out.print("1 -- Verificar saldo\n2 -- Depositar\n3 -- Sacar\n4 -- Detalhes da conta\n\n0 -- Sair\n");
        do{
            opc =sc.next().charAt(0);
        }while(opc < '0' || opc > '4');

        System.out.println();
        switch(opc) {
            case '1':
                System.out.printf("Saldo: R$ %.2f\n", conta.getSaldo());
                break;
            case '2':
                System.out.print("Entre o valor a ser depositado: R$");
                valor = sc.nextDouble();
                sc.nextLine();

                conta.depositar(valor);
                break;
            case '3':
                System.out.print("Entre o valor a ser sacado: R$");
                valor = sc.nextDouble();
                sc.nextLine();

                if (conta.sacar(valor)) {
                    System.out.print("Valor sacado com sucesso!");
                    System.out.printf("Novo saldo: R$ %.2f\n", conta.getSaldo());
                } else {
                    System.out.print("Saldo insuficiente\n");
                    System.out.printf("Saldo atual: R$ %.2f\n", conta.getSaldo());
                }
                break;
            case '4':
                System.out.print("Detalhes da conta: \n\n");
                conta.detalhes();
                break;
            default:
                return false;
        }
        Main.continuar();
        return true;
    }


}