class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
       
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i<n-m+1 ; i++){
            int min  = a.get(i);
            int max = a.get(i+m-1);
            ans = Math.min(ans,max-min);
        }
        return ans;
    }
}
