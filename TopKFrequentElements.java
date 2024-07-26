class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        int n = nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0 ; i<n ; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],1);
            }
            else{
                mp.put(nums[i],mp.get(nums[i])+1);
            }
        }
        for(int i = 0; i<k; i++){
            int maxKey = Collections.max(mp.entrySet(), Map.Entry.comparingByValue()).getKey();
            arr[i] = maxKey;
            mp.remove(maxKey);
        }
        return arr;
    }
}
