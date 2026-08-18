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
    public ListNode doubleIt(ListNode head) {
        
        head = reverse(head);
        ListNode curr = head;
        int carry =0;
        ListNode prev = null;

        while(curr != null){
            int x = curr.val *2 +carry;
            curr.val = x %10;
            carry = x/10;
            prev = curr;
            curr = curr.next;
        }

        if(carry != 0){
            ListNode carr = new ListNode(carry);
            prev.next = carr;
            carr.next = null;
        }

        return reverse(head);
    }
    public ListNode reverse(ListNode head){
        
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}