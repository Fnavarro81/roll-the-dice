package com.pluralsight;

public class Dice {
    private int roll() {
        int randomNUmber = (int)(Math.random() * (6 - 1 + 1)) + 1;
        return roll();
    }
}
