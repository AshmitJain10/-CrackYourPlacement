class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] dp = new int[10001];
        for(int i : nums){
            dp[i]+=i;
        }
        int a = 0 ;
        int b = 0;
        for(int i: dp){
            int tmp = a;
            a=Math.max(b+i,a);
            b=tmp;
        }
        return a;
    }
}
