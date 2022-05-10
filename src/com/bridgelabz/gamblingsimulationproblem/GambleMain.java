package com.bridgelabz.gamblingsimulationproblem;
public class GambleMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Gamble game ");
        //UC6 find luckiest and unLuckiest day
        int totalInvestedMoney = 3000;
        GamblerGame objectGamble = new GamblerGame();
        int totalMoneyForMonth = objectGamble.gamble();
        System.out.println("the total money on first month: "+ totalMoneyForMonth);
    }
}