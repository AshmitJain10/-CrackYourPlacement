class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int[] dp = new int[n+1];
        int pichda  = 0;;
        for(int i = 1 ; i<=n ; i++){
            pichda = 0;
            for(int j =1 ; j<=n ; j++){
                int temp = dp[j];
                if(s.charAt(i-1)==s.charAt(n-j)){
                    dp[j] = pichda+1;
                }
                else{
                    dp[j] = Math.max(dp[j],dp[j-1]);
                }
                pichda = temp;
            }
        }
        return n-dp[n];
    }
}
