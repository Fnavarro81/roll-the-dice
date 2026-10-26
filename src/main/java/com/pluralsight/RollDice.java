package com.pluralsight;

public class RollDice {
    public static void main(String[] args) {
        Dice dice = new Dice();

        // Creating loop
        int count = 1;
        int roll1 = 0;
        int roll2 = 0;
        int rolledTwo = 0;
        int rolledFour = 0;
        int rolledSix = 0;
        int rolledSeven = 0;


        while (count < 100){
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;
            System.out.println("Roll" + count + ":" + roll1 + " + " + roll2 + " Sum: " + sum);
            count++;
        }
    }
}
