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

        // Loop
        while (count < 101){
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;
            System.out.println("Roll" + count + ":" + roll1 + " + " + roll2 + " Sum: " + sum);
            // Specific sum of
            if (sum == 2){
                rolledTwo++;
            } else if (sum == 4) {
                rolledFour++;
            } else if (sum == 6) {
                rolledSix++;
            } else if (sum == 7) {
                rolledSeven++;
            }
            count++;
        }

        // SUm of print out
        System.out.println("Sum of 2 happened: " + rolledTwo);
        System.out.println("Sum of 4 happened: " + rolledFour);
        System.out.println("Sum of 6 happened: " + rolledSix);
        System.out.println("Sum of 7 happened: " + rolledSeven);
    }
}
