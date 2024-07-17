class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0 ; i<nums.length ; i++){
            if(mp.containsKey(nums[i])){
                result[0]=i;
                result[1] = mp.get(nums[i]);
            }
            else{
                mp.put(target-nums[i],i);
            }
        }
        return result;
    }
}
