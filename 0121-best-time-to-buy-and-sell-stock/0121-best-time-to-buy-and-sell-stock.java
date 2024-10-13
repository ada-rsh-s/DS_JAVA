class Solution {
    public int maxProfit(int[] prices) {
          int min = Integer.MAX_VALUE; // Initialize to a large value
        int max = 0;                 // Initialize to 0 (no profit)

        // Iterate through prices and calculate max profit
        for (int n : prices) {
            min = Math.min(min, n);           // Find the minimum price so far
            max = Math.max(max, n - min);     // Calculate the profit and update max
        }

        return max; // Return the maximum profit found
       
    }
}