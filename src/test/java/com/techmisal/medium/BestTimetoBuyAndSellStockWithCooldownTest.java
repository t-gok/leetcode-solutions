package com.techmisal.medium;

import org.junit.Assert;
import org.junit.Test;

public class BestTimetoBuyAndSellStockWithCooldownTest {
    private BestTimetoBuyAndSellStockWithCooldown bestTimetoBuyAndSellStockWithCooldown = new BestTimetoBuyAndSellStockWithCooldown();

    @Test
    public void testBestTimeToBuyAndSellStockWithCooldownTest() {
        Assert.assertEquals(3, bestTimetoBuyAndSellStockWithCooldown.maxProfit(new int[] {1,2,3,0,2}));
    }
}
