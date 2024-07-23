class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans  = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int ckt = 0;
        while(i>=0 || j>=0){
            int tmp = ckt;
            if(j>=0){
                tmp+=b.charAt(j--) - '0';

            }
            if(i>=0){
                tmp+=a.charAt(i--)-'0';
            }
            ans.append(tmp%2);
            ckt=tmp/2;
        }
        if(ckt!=0){
            ans.append(ckt);
            
        }
        return ans.reverse().toString();
    }
}
