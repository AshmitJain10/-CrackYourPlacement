class Solution {
    public int removeDuplicates(int[] nums) {
       LinkedHashSet<Integer> st = new LinkedHashSet<>();
       for(int i : nums){
           st.add(i);
       }
       int i = 0 ;
       for(int j: st){
           nums[i++]=j;
       }
       return st.size();
    }
}
