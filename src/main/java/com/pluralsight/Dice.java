package com.pluralsight;

import java.util.Random;

public class Dice {
    public int roll() {
        int randomNUmber = (int)(Math.random() * (6 - 1 + 1)) + 1;
        return randomNUmber;
    }
}
