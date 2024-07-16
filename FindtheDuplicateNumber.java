class Solution {
    public int findDuplicate(int[] nums) {
        // Using Binary Search
        int n = nums.length;
        int low = 1 ; 
        int high = nums.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            int ckt = 0;
            for(int i = 0 ; i<n ; i++){
                if(nums[i]<=mid){
                    ckt++;
                }
            }
            if(ckt<=mid){
                low = mid+1;

            }
            else{
                high = mid;
            }
        }
        return low;
    }
}
