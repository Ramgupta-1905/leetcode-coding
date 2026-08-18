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
        int finalcarr = multiply(head);
        if(finalcarr != 0){
        ListNode temp = new ListNode(finalcarr,head);
        return temp;
        }
        return head;
    }
    public int multiply(ListNode curr){
        if(curr == null)
            return 0;
        int carry = multiply(curr.next);
        int x = curr.val*2 +carry;
        curr.val = x%10;
        return x/10;
    }
}