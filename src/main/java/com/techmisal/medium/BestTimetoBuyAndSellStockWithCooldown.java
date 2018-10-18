package com.techmisal.medium;

public class BestTimetoBuyAndSellStockWithCooldown {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0 || n == 1)
            return 0;
        int[][] profit = new int[n][2];
        profit[n - 1][0] = 0;
        profit[n - 1][1] = prices[n-1];
        profit[n - 2][0] = Math.max(profit[n-1][0], profit[n-1][1]-prices[n-2]);
        profit[n - 2][1] = Math.max(profit[n-1][1], prices[n-2]);
        for(int i=n-3; i>=0; i--){
            profit[i][0] = Math.max(profit[i+1][0], profit[i+1][1]-prices[i]);
            profit[i][1] = Math.max(profit[i+1][1], profit[i+2][0]+prices[i]);
        }
        return profit[0][0];
    }
}
