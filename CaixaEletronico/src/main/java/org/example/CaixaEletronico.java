package org.example;

import java.util.Scanner;

public class CaixaEletronico {

    boolean menu(ContaBancaria conta){
        Scanner sc = new Scanner(System.in);
        char opc;
        double valor;

        System.out.printf("1 -- Verificar saldo\n2 -- Depositar\n3 -- Sacar\n4 -- Detalhes da conta\n\n0 -- Sair\n");
        do{
            opc =sc.next().charAt(0);
        }while(opc < '0' || opc > '4');

        System.out.println();
        switch(opc) {
            case '1':
                conta.getSaldo();
                break;
            case '2':
                System.out.printf("Entre o valor a ser depositado: R$");
                valor = sc.nextDouble();
                sc.nextLine();

                conta.depositar(valor);
                System.out.printf("Valor depositado com sucesso!!\n");
                conta.getSaldo();
                break;
            case '3':
                System.out.printf("Entre o valor a ser sacado: R$");
                valor = sc.nextDouble();
                sc.nextLine();

                if (conta.sacar(valor)) {
                    System.out.printf("Valor sacado com sucesso!");
                    conta.getSaldo();
                } else {
                    System.out.printf("Saldo insuficiente\n");
                    conta.getSaldo();
                }
                break;
            case '4':
                System.out.printf("Detalhes da conta: \n\n");
                conta.detalhes();
                break;
            default:
                return false;
        }
        Main.continuar();
        return true;
    }


}