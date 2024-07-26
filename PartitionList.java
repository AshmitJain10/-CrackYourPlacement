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
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        ListNode t1 = left;
        ListNode t2 = right;
        ListNode it = head;
        while(it!=null){
            if(it.val<x){
                t1.next = it;
                t1 = t1.next;
            }
            else{
                t2.next = it;
                t2 = t2.next;
            }
            it = it.next;
        }
        t1.next = right.next;
        t2.next = null;
        return left.next;
    }
}
