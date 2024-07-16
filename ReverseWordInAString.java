class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i = s.length()-1 ; i>=0 ; i--){
            if(s.charAt(i)==' '){
                continue;
            }
            int j = i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            ans.append(s.substring(i+1,j+1)).append(" ");
        }
        return ans.toString().strip();
    }
}
