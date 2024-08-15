package br.com.unicesumar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre o nome: ");
        String nome = teclado.nextLine();

        System.out.println("Entre a idade:");
        int idade = teclado.nextInt();
        teclado.nextLine();

        Pessoa p = new Pessoa(nome, idade);

        p.imprimir();

        System.out.println("O que você está comendo?");
        String comida = teclado.nextLine();

        System.out.printf("A idade de %s é %d anos", p.nome, p.idade);

        p.comer(comida);

    }
}