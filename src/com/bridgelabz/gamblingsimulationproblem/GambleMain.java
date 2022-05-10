package com.bridgelabz.gamblingsimulationproblem;
public class GambleMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Gamble game ");
        //UC7 If have won money than he invested then play for the month
        int totalInvestedMoney = 3000;
        GamblerGame objectGamble = new GamblerGame();
        int totalMoneyForMonth = objectGamble.gamble();
        System.out.println("the total money on first month: "+ totalMoneyForMonth);
        if(totalMoneyForMonth>totalInvestedMoney){
            totalMoneyForMonth= objectGamble.gamble();
            System.out.println("the total money on next month: "+ totalMoneyForMonth);
        }
        else {
            System.out.println("*********************Stop Gambling*****************************");
        }
    }
}