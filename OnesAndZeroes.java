class Solution {
    public int findMaxForm(String[] str, int m, int n) {
        int dp[][] = new int[m+1][n+1];
        for(String s :str){
            int z = 0;
            int o = 0;
            for(char c:s.toCharArray()){
                if(c=='0'){
                    z++;
                    }
                    else{
                        o++;
                    }
            }
            for(int i = m ; i>=z ; i--){
                for(int j = n ; j>=o ; j--){
                    dp[i][j] = Math.max(dp[i][j],dp[i-z][j-o]+1);
                }
            }

        }
        return dp[m][n];
    }
}
