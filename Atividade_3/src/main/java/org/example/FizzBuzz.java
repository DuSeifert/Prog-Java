package org.example;

public class FizzBuzz {

    int n;

    public FizzBuzz(int n){
        this.n = n;
    }


    public void executar(){
        int i = 1;
        Fizz fizz = new Fizz();
        Buzz buzz = new Buzz();

        while(i<=n){
            notFizzBuzz(i);
            fizz.printFizz(i);
            buzz.printBuzz(i);

            i++;
            System.out.println();
        }
    }

    private static void notFizzBuzz(int n){
        if(n%3 != 0 && n%5 != 0){
            System.out.print(n);
        }
    }
}
