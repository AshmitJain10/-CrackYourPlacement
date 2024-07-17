class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans = 0;
         int rem = 0;
         HashMap<Integer,Integer> mp = new HashMap<>();
         mp.put(0,1);
         for(int i = 0 ; i<nums.length ; i++){
            rem+=nums[i];
            int tmp = rem%k;
            if(tmp<0){
                tmp+=k;
            }
            if(mp.containsKey(tmp)){
                ans+=mp.get(tmp);
            }
            mp.put(tmp,mp.getOrDefault(tmp,0)+1);
         }
         return ans;
    }
}
