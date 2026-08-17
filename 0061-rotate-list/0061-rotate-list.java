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
    public ListNode rotateRight(ListNode head, int k) {
       if(head == null || head.next == null)
       return head;
       ListNode curr = head;
       int size = 0;
       while(curr!= null){
        size++;
        curr = curr.next;
       }
       int rotate = k%size;

      ListNode slow = head;
      ListNode fast = head;
      while(rotate !=0 && fast != null){
        fast = fast.next;
        rotate--;
      }

      while(fast.next!= null){
        slow = slow.next;
        fast = fast.next;
      }
     fast.next = head;
     head = slow.next;
     slow.next = null;

     return head;
    }
}