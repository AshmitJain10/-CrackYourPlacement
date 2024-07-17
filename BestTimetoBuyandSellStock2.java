class Solution {
    public int maxProfit(int[] prices) {
        int i = 0 ; 
        int buy = 0 ; 
        int sell = 0 ; 
        int munafa = 0 ;
        while(i<prices.length - 1){
            while(i<prices.length- 1 && prices[i+1]<=prices[i]) i++;
            buy = prices[i];
            while(i<prices.length - 1 && prices[i+1]>=prices[i]) i++;
            sell = prices[i];
            munafa = munafa + sell - buy ;

        }
        return munafa;
    }
}
