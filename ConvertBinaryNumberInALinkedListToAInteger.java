class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder s = new StringBuilder();
        ListNode temp = head ;
        while(temp!=null){
            s.append(temp.val);
            temp = temp.next;
        }
        int ans = Integer.parseInt(s.toString(),2);
        return ans;
    }
}
