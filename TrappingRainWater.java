class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int paani = 0;
        int left = 0 ;
        int right = 0;
        while(i<j){
            if(height[i]>left){
                left = height[i];

            }
            if(height[j]>right){
                right = height[j];
            }
            if(left<right){
                paani += left - height[i];
                i++;
            }
            else{
                paani += right - height[j];
                j--;
            }
        }
        return paani;
    }
}
