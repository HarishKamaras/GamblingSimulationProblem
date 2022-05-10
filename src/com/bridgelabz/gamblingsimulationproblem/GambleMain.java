package com.bridgelabz.gamblingsimulationproblem;

public class GambleMain {
    public static void main(String[] args) {
        int betEverygame = 1;
        int currentDayMoney = 100;
        int totalMoney = 0;
        System.out.println(" Welcome to Gamble game");
        System.out.println("betEverygame : " + betEverygame);
        //UC4 Total money after 20 days of gamble
        for (int i = 0; i < 20; i++) {
            int j = 0;
            int win = 0;
            int lose = 0;
            int startingMoney = 100;
            while ((startingMoney * 100) / 100 > 50 && (startingMoney * 100) / 100 < 150) {
                int bet = (int) (Math.random() * 10) % 2;
                if (bet == 1) {
                    startingMoney = startingMoney + 1;
                    win++;
                } else {
                    startingMoney = startingMoney - 1;
                    lose++;
                }
                j++;
            }
            System.out.println("*******************day:" + i+"********************");
            System.out.println("how many times played : " + j);
            System.out.println("how many times win : " + win);
            System.out.println("how many times lose : " + lose);
            currentDayMoney = startingMoney;
            totalMoney = totalMoney + currentDayMoney;
            System.out.println("total money per day" + currentDayMoney);
            System.out.println("**************************************");
        }
        System.out.println("total money after 20days : "+totalMoney);
    }}