package com.bridgelabz.gamblingsimulationproblem;

public class GamblerGame {
    public int gamble() {
        int betEverygame = 1;
        int totalMoney = 0;
        int currentDayMoney = 100;

        //UC5 Each Month Days lose and won
        for (int i = 0; i < 30; i++) {
            int j = 0;
            int win = 0;
            int lose=0;

            int startingMoney =100;

            while ((startingMoney * 100) / 100 > 50 && (startingMoney * 100) / 100 < 150) {
                // win = 0;
                //lose =0;
                int bet = (int) (Math.random() * 10) % 2;
                // j=1;
                //     System.out.println("how many timePlayed : " + j);
                if (bet == 1) {
                    startingMoney = startingMoney + 1;
                    //           System.out.println("win currentmoney : " + startingMoney);
                    win++;
                } else {
                    startingMoney = startingMoney - 1;
                    //             System.out.println("lost currentmoney : " + startingMoney);
                    lose++;
                }
                //currentMoneyday1 = startingMoney;
                j++;

            }
            System.out.println("*******************day:" + i+"********************");
            System.out.println("how many times played : "+j);
            System.out.println( "how many times win : "+win);
            System.out.println("how many times lose : "+lose);
            //if()
            currentDayMoney = startingMoney;
            totalMoney = totalMoney + currentDayMoney;
            //System.out.println("**************************************day:"+i);
            System.out.println("total money per day : " + currentDayMoney);
            System.out.println("**************************************");
        }
        System.out.println("total money after month : "+totalMoney);
        return totalMoney;
    }
}
