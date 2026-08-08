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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode sprev = dummy;
        ListNode prev = dummy.next;
        ListNode curr = dummy.next.next;
        while(curr != null){
            if(prev.val == curr.val){
                sprev.next = rootfind(prev);
            }
            else{
                sprev = sprev.next;
            }
             prev = sprev.next;
              if(prev == null)
                    return dummy.next;
            curr = prev.next;
        }
        return dummy.next;
    }
    private ListNode rootfind(ListNode head){
        if(head == null || head.next == null)
            return head;
        while(head.next != null && head.val == head.next.val){
            head = head.next;
        }
        return head.next;
    }
}