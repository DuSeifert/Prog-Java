package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre o valor de N: ");
        int n = sc.nextInt();
        sc.close();

        FizzBuzz fizzbuzz = new FizzBuzz(n);
        fizzbuzz.executar();

    }
}