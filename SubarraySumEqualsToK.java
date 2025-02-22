class Solution {
    public int subarraySum(int[] nums, int k) {
       int[] sum = new int[nums.length+1];
       sum[0] = 0;
       for(int i = 1 ; i<sum.length ; i++){
           sum[i] = nums[i-1]+sum[i-1]; 
       } 
       int count = 0; 
       for(int i = 0 ; i<sum.length ; i++){
           for(int j = i+1 ; j<sum.length ; j++){
               if(sum[j]-sum[i]==k){
                   count++;
               }
           }
       }
       return count;
    }
}
