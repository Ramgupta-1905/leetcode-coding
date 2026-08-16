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
        ListNode dummy1 = new ListNode();
        dummy1.next = head;
        ListNode dummy2 = new ListNode();
        ListNode temp = dummy2;
        ListNode prev = dummy1;
        ListNode curr = prev.next;

        while(curr != null){
            ListNode next = curr.next;
          if(curr.val < x){
            temp.next = curr;
            prev.next = next;
            temp = temp.next;
            temp.next = null;
          }else{
            prev = curr;
          }
          curr = next;
        }
        temp.next = dummy1.next;
        return dummy2.next;
    }
}