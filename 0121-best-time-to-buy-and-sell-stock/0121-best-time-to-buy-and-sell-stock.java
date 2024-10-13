class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int minPrice = prices[0];  // Start with the first price as the minimum
        int maxProfit = 0;          // Initialize max profit to 0

        for (int i = 1; i < prices.length; i++) {
            // Update minPrice if we find a lower price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // Calculate profit if we sell at the current price
                int profit = prices[i] - minPrice;
                // Update maxProfit if the calculated profit is greater
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit; // Return the maximum profit found
    }
}