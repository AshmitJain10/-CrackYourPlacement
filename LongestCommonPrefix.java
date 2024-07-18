class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        String s = strs[0];
        String s2 = strs[strs.length-1];
        int i = 0;
        while(i<s.length() && i<s2.length()){
            if(s.charAt(i)==s2.charAt(i)){
                i++;
            }
            else{
                break;
            }
        }
        String ans = s.substring(0,i);
        return ans;
    }
}
