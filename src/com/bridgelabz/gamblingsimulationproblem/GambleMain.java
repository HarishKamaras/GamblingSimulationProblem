package com.bridgelabz.gamblingsimulationproblem;

public class GambleMain {
    public static void main(String[] args) {
        int startingMoney = 100;
        int betEverygame = 1;
        int win =0;
        int lose =0;
        System.out.println(" Welcome to Gamble game");
        System.out.println("starting money : " +startingMoney);
        System.out.println("betEverygame : " +betEverygame);
        //UC2 WinORLoss
        int bet = (int) (Math.random() * 10) % 2;
        System.out.println("Bet : "+bet);
        if (bet == 1) {
            startingMoney = startingMoney + 1;
                     System.out.println("win currentmoney : " + startingMoney);
            win++;
        } else {
            startingMoney = startingMoney - 1;
                      System.out.println("lost currentmoney : " + startingMoney);
            lose++;
        }
    }
}
