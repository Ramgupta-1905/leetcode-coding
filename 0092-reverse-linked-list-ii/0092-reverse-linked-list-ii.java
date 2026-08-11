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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int count = right-left;
        if(head == null || head.next == null || right == left)
            return head;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre_pre = dummy;
        ListNode prev=dummy;
        ListNode curr= prev.next;
        while(left !=0){
            pre_pre = prev;
            prev = curr;
            curr = curr.next;
            left--;
        }
        if(curr == null)
            return head;
        ListNode temp = prev;
        ListNode next = curr.next;

        while(count > 0){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count--;
        }
        temp.next = next;
        pre_pre.next = prev;

        return dummy.next;
    }
}