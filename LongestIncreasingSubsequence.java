class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] temp = new int[nums.length];
        int ckt = 0 ;
        for(int i: nums){
            int low = 0 ;
            int high = ckt;
            while(low!=high){
                int mid = low+(high-low)/2;
                if(temp[mid]<i){
                    low = mid +1;
                }
                else{
                    high = mid;
                }
            }
            temp[low] = i;
            if(low==ckt){
                ckt++;
            } 
        }
        return ckt;
    }
}
