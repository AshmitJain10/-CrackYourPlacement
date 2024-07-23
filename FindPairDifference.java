class Solution {
    public int findPair(int n, int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int i = 0;
        int j = 1;
        while(i<n && j<n){
            int d = arr[j]-arr[i];
            if(d==x && i!=j){
                return 1;
            }
            else if(d<x){
                j++;
            }
            else{
                i++;
            }
    }
    return -1;
}
}
