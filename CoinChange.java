class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        dp[0] = 0;
        for(int i = 1 ; i<amount+1 ; i++){
            for(int coin : coins){
                dp[i] = Math.min(dp[i],dp[i-coin]);
            }
        }
        return dp[amount];
    }
}
