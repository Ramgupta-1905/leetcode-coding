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

        while (head != null && head.next != null && head.val == head.next.val) {
            head = rootfind(head);
        }

        if(head == null || head.next == null)
                    return head;
        ListNode sprev = head;
        ListNode prev = head.next;
        ListNode curr = head.next.next;
        while(curr != null){
            if(prev.val == curr.val){
                sprev.next = rootfind(prev);
            }
            else{
                sprev = sprev.next;
            }
             prev = sprev.next;
              if(prev == null)
                    return head;
            curr = prev.next;
        }
        return head;
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