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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int k =0;
        if(list1 == null || list2 == null)
            return list1;
        ListNode start = list1;
        ListNode end = new ListNode();
        while(k!=a-1){
            start = start.next;
            k++;
        }
        end = start;
        while(k!=b){
            end = end.next;
            k++;
        }
        start.next = list2;
        ListNode curr = list2;
        while(curr.next!= null){
            curr = curr.next;
        }
        curr.next = end.next;
        end.next = null;
        return list1;
    }
}