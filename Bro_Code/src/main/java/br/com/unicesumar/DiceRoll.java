package br.com.unicesumar;

import java.util.Random;

public class DiceRoll {

        int dice;

        DiceRoll(int dice){
            this.dice = dice;
        }

        void roll(int dice){
            Random random = new Random();
            int num = random.nextInt(dice)+1;
            System.out.printf("d%d = %d\n", dice, num);
        }


}
