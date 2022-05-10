package com.bridgelabz.gamblingsimulationproblem;

public class GambleMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Gamble game ");
        //UC5 total money for month
        GamblerGame objectGamble = new GamblerGame();
        objectGamble.gamble(); //Month1
        objectGamble.gamble(); //month2
    }
}