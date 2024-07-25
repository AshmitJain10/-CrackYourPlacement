class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> a = new ArrayList<List<Integer>>();
        if(k>n || k<0){
            return a;
        }
        if(k==0){
            a.add(new ArrayList<Integer>());
            return a;
        }
        a = combine(n-1,k-1);
        for(List<Integer> l : a){
            l.add(n);
        }
        a.addAll(combine(n-1,k));
        return a;
    }
}
