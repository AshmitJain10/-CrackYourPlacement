class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[][] dp = new int[n+1][m+1];
        int max =0;
        for(int i = n-1 ; i>=0 ; i--){
            for(int j = m
            -1 ; j>=0 ; j--){
                if(nums2[j]==nums1[i]){
                    dp[i][j] = dp[i+1][j+1]+1;
                    max = Math.max(max,dp[i][j]);
                }
            }
        }
        return max;
    }
}
