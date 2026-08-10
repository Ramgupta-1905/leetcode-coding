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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int x: nums)
            set.add(x);
        while(set.contains(head.val)){
            head = head.next;
        }
        ListNode curr = head.next;
        ListNode prev =head;
        while(curr!=null){
            if(set.contains(curr.val)){
                prev.next = curr.next;
            }
            else{
                prev = prev.next;
            }
             curr = curr.next;
        }
        return head;
    }
}