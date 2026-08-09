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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null)
            return true;
        if(head.next.next == null){
            if(head.val == head.next.val)return true;
            else
                return false;
        }
        ListNode start = head;
        ListNode end = head;
        while(end !=null && end.next!=null){
            start = start.next;
            end = end.next.next;
        }
        ListNode prev = null;
        ListNode curr = start;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        end = prev;
        start = head;
        while(end !=null){
            if(start.val != end.val)
                return false;
            start = start.next;
            end = end.next;
        }
        return true;
    }
}