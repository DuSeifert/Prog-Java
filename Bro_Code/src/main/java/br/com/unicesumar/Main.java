package br.com.unicesumar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        DiceRoll dice = new DiceRoll(1);

        while(true){
            System.out.printf("Dice size: (0 to exit): ");
            num = sc.nextInt();
            sc.nextLine();

            if(num == 0){
                break;
            }

            dice.roll(num);

            System.out.println();

        }


    }
}
