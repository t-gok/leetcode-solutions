package com.techmisal.medium;
/* Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times) with the following restrictions:

You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
After you sell your stock, you cannot buy stock on next day. (ie, cooldown 1 day)
Example:

Input: [1,2,3,0,2]
Output: 3
Explanation: transactions = [buy, sell, cooldown, buy, sell]*/
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
