class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l = new ArrayList<>();
        Set<Integer> st = new HashSet<>();
        for(int num : nums){
            if(st.contains(num)){
                l.add(num);
            }
            st.add(num);
        }
        return l;
    }
}
