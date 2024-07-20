class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       ArrayList<List<String>> res = new ArrayList<List<String>>();
       HashMap<String , Integer> mp = new HashMap<String,Integer>();
       for(int i = 0 ; i<strs.length ;i++){
           char[] temp = strs[i].toCharArray();
           Arrays.sort(temp);
           String tmp = new String(temp);
           if(mp.containsKey(tmp)){
               res.get(mp.get(tmp)).add(strs[i]);
               continue;
           }
           List<String> chal = new LinkedList<String>();
           chal.add(strs[i]);
           res.add(chal);
           mp.put(tmp,res.size()-1);
       } 
       return res;
    }
}
