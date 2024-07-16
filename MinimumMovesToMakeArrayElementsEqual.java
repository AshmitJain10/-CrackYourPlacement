class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        int ckt = 0;
        while(i<j){
            ckt+=nums[j]-nums[i];
            i++;
            j--;
        }
        return ckt;
    }
}
