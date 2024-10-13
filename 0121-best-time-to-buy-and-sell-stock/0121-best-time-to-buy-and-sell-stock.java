class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for (int dayPrice : prices) {
            min = Math.min(min, dayPrice);
            profit = Math.max(profit, dayPrice - min);
        }

        return profit;

    }
}