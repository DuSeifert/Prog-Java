package org.example;

public class Calcular {

    private int numA;
    private int numB;

    public Calcular(int a, int b) {
        this.numA = a;
        this.numB = b;
    }

    int somar() {
        return numA + numB;
    }

    int subtrair() {
        return numA - numB;
    }

    int multiplicar() {
        return numA * numB;
    }

    int dividir() {
        return numA / numB;
    }

    public int getA(){
        return this.numA;
    }

}
