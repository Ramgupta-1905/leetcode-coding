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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;
        ListNode curr = head;
        ListNode next = head;
        ListNode start = head;
        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        dummy.next = head;
        while(curr!= null){
            int n = k-1;
            while(n--!=0 ){
                if(curr == null)
                    return dummy.next;
                curr = curr.next;
            }
            if(curr == null)
                return dummy.next;
            next = curr.next;
            ListNode rev = reverse(start,k);
            prev.next = rev;
            start.next = next;
            prev = start;
            curr = next;
            start = next;
        }
        return dummy.next;
    }
    public ListNode reverse(ListNode head , int n){
        ListNode prev = null;
        ListNode curr = head;
        while(n-- != 0){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}