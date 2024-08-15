package org.example;

public class Main {
    public static void main(String[] args) {

        Calcular calc = new Calcular(10, 5);

        System.out.printf("soma = %d\nsubtração = %d", calc.somar(), calc.subtrair());
        System.out.printf("\n\nmultiplicar = %d\nDivisão = %d", calc.multiplicar(), calc.dividir());
        System.out.printf("\n\nNúmero a = %d", calc.getA());


    }
}