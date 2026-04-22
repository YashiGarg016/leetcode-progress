// Last updated: 23/04/2026, 00:05:23
// class Solution {
//     public int coinChange(int[] coins, int amount) {
//         int n = coins.length;
//         int dp = new int[n][amount + 1];
//         for(int i = 0; i < amount; i++){
//             if(amount % coins[i] == 0){
//                 dp[0][amount] =  amount/coins[0];
//             }
//             else{
//                 dp[0][1] = Integer.MAX_VALUE;
//             }
//         }
//         for(int ind = 1; ind < n; ind++){
//             for(int target = 0; target <= amount; target++){
//                 int notTake  = 0 + dp[ind - 1][target];
//                 int take = Integer.MAX_VALUE;
//                 if(coins[ind] <= target){
//                     take = 1 + dp[ind][target - coins[ind]];
//                 }
//                 dp[ind][target] = Math.min(take, notTake);
//             }
//         }
//     }
// }

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] minCoins = new int[amount + 1];
        Arrays.fill(minCoins, amount + 1);
        minCoins[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0) {
                    minCoins[i] = Math.min(minCoins[i], 1 + minCoins[i - coins[j]]);
                }
            }
        }

        return minCoins[amount] != amount + 1 ? minCoins[amount] : -1;        
    }
}