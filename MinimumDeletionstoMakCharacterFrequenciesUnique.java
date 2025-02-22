class Solution {
    public int minDeletions(String s) {
       int[] freq = new int[26];
        for(char ch:s.toCharArray()) freq[ch-'a']++;
        Arrays.sort(freq);
        int res = 0;
        for(int i=24;i>=0;i--){
            if(freq[i] == 0) break;
            if(freq[i] >= freq[i+1]){
                int count = freq[i] - freq[i+1] + 1;
                freq[i] -= count;
                res += count;
                if(freq[i] < 0) res += freq[i];
            }
        }
        return res;
    }
}
