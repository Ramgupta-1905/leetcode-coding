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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head.next;
        int sum =0;
        ListNode start = head;
        while(curr!=null){
            if(curr.val !=0){
                sum = sum+curr.val;
            }
            else{
                start.val = sum;
                sum =0;
                if(curr.next!=null)
                start = start.next;
            }
            curr = curr.next;
        }
        start.next = null;
        return head;
    }
}