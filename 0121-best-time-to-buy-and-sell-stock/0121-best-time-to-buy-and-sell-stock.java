class Solution {
    public int maxProfit(int[] prices) {
        int smallest=prices[0];
        int profit=0;

        for(int i=1;i<prices.length;i++){
            if(prices[i]<smallest) {
                smallest=prices[i];
            }else{
                if(profit<(prices[i]-smallest))
                profit=prices[i]-smallest;                
            }
        }
        return profit;
       
    }
}