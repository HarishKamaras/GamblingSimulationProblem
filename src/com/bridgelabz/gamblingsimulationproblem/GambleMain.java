package com.bridgelabz.gamblingsimulationproblem;

public class GambleMain {
    public static void main(String[] args) {
        int startingMoney = 100;
        int betEverygame = 1;
        int win = 0;
        int lose = 0;
        int currentDayMoney = 100;
        System.out.println(" Welcome to Gamble game");
        System.out.println("starting money : " + startingMoney);
        System.out.println("betEverygame : " + betEverygame);
        //UC3 if win or lose 50% of stake resign the game
        int j = 1;
        while ((startingMoney * 100) / 100 > 50 && (startingMoney * 100) / 100 < 150) {

            int bet = (int) (Math.random() * 10) % 2;

                System.out.println("how many timePlayed : " + j);
            if (bet == 1) {
                startingMoney = startingMoney + 1;
                System.out.println("win currentmoney : " + startingMoney);
                win++;
            } else {
                startingMoney = startingMoney - 1;
                System.out.println("lost currentmoney : " + startingMoney);
                lose++;
            }
            currentDayMoney = startingMoney;
            j++;
        }
        System.out.println("*****************************************");
        System.out.println("Total money on per Day : "+currentDayMoney);
    }
}
