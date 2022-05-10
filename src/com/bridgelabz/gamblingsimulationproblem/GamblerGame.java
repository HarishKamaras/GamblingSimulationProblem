package com.bridgelabz.gamblingsimulationproblem;

public class GamblerGame {
    public int gamble() {
        //UC7 if have won money than he invested then play for the month
        int betEverygame = 1;
        int totalMoney = 0;
        int currentDayMoney = 100;
        int maxwinday = 0;
        int maxloseday = 0;
        int luckiestday = 0;
        int unluckiestday = 0;
        for (int i = 0; i < 30; i++) {
            int j = 0;
            int win = 0;
            int lose=0;
            int startingMoney =100;
            while ((startingMoney * 100) / 100 > 50 && (startingMoney * 100) / 100 < 150) {
                int bet = (int) (Math.random() * 10) % 2;
                if (bet == 1) {
                    startingMoney = startingMoney + 1;
                    //           System.out.println("win currentmoney : " + startingMoney);
                    win++;
                } else {
                    startingMoney = startingMoney - 1;
                    //             System.out.println("lost currentmoney : " + startingMoney);
                    lose++;
                }
                j++;
            }
            if(maxwinday < win )
            {
                maxwinday = win;
                luckiestday = i;
            }
            if(maxloseday < lose){
                maxloseday =lose;
                unluckiestday =i;
            }
            System.out.println("********************day:"+i+"******************");
            System.out.println("how many times played : "+j);
            System.out.println( " how many times win : "+win);
            System.out.println("how many times lose : "+lose);
            System.out.println("luckiest day : "+luckiestday+ " Money: "+maxwinday);
            System.out.println("Unluckiest day : "+unluckiestday+ "  Money: "+maxloseday);
            currentDayMoney = startingMoney;
            totalMoney = totalMoney + currentDayMoney;
            System.out.println("total money per day" + currentDayMoney);
            System.out.println("**************************************");
        }
        System.out.println();
        System.out.println("#############MonthlyResult#################");
        System.out.println("total money after this month : "+totalMoney);
        System.out.println("luckiest day : "+luckiestday+ " Money: "+maxwinday);
        System.out.println("Unluckiest day : "+unluckiestday+ "  Money: "+maxloseday);
        System.out.println("############################################");
        return totalMoney;
    }
}
