/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode ckt = head;
        int count = 0;
        while(ckt!=null){
            ckt = ckt.next;
            count++;
        }
        ListNode curr = head;
        for(int i = 0 ; i<count/2;i++){
            curr = curr.next;
        }
        return curr;
    }
}
