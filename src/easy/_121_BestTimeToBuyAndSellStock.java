package easy;

public class _121_BestTimeToBuyAndSellStock {
    /**
     * 121. Best Time to Buy and Sell Stock
     * @param prices array where prices[i] is the price of a given stock on the ith day
     * @return the maximum profit you can achieve from this transaction.
     * If you cannot achieve any profit, return 0
     */
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0], maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else {
                int currProfit = prices[i] - buyPrice;
                maxProfit = Math.max(currProfit, maxProfit);
            }

        }

        return maxProfit;
    }
}
