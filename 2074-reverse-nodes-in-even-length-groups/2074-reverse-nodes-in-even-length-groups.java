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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode curr = head;
        ListNode prev = head;
        int groupsize =1;
        ListNode pre = null;
        while(curr != null){
            ListNode start = curr;
            int actualsize =0;
            while(curr!= null && actualsize < groupsize){
                pre = curr;
                curr = curr.next;
                actualsize++;
            }
            if(actualsize %2 == 0){
            ListNode temp = reverse(start,curr);
            prev.next = temp;
            start.next = curr;
            prev = start;
            }
            else{
                prev = pre;
            }
            groupsize++;
        }
        return head;
    }
    public ListNode reverse(ListNode head,ListNode end){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!= end){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =next;
        }
        return prev;
    }
}