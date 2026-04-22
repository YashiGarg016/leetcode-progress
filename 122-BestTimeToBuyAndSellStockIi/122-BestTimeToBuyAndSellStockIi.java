// Last updated: 23/04/2026, 00:06:28
class Solution {
    
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length + 1][2];
        for (int[] row : dp) {
    Arrays.fill(row, 0);
}
        dp[prices.length][0] = dp[prices.length][1] = 0;
        for(int idx = prices.length - 1; idx >= 0; idx--){
            for(int buy = 0; buy <= 1; buy++){
                int profit = 0;
        
        // if(idx == prices.length) {return 0;}

        // if(dp[idx][buy] != -1) {return dp[idx][buy];}

        if(buy == 1){
            profit = Math.max(-prices[idx] + dp[idx + 1][0], 0 + dp[idx + 1][1]);
        }
        else{
            profit = Math.max(prices[idx] + dp[idx + 1][1],0 + dp[idx + 1][0]);
        }
        dp[idx][buy] = profit;
            }
        }
        return dp[0][1];
        
    }
}