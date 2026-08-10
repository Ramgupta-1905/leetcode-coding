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
    public int getDecimalValue(ListNode head) {
        
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        int num =0;
        int i =0;
        while(prev!=null){
            num = num + prev.val *(int) Math.pow(2,i++);
            prev = prev.next;
        }
        return num;
    }
}