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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] res = new int[2];
        res[0] =-1;
        res[1] = -1;
        if((head == null || head.next == null )|| head.next.next == null ) return res;
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next = curr.next;
        int k =0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int precr = 0;
        int first = 0;
        int cr =0;
        while(next!= null){
            if((curr.val<prev.val && curr.val < next.val ) || (curr.val > prev.val && curr.val > next.val)){
                cr++;
                if(cr==1)
                    first = k;
                else
                    min = Math.min(min,k-precr);
                max = Math.max(max,k-first);
                precr = k;
            }
            k++;
            prev = curr;
            curr = next;
            next = next.next;
        }
        if(cr <2)
            return res;
        res[0] = min;
        res[1] = max;
        return res;
    }
}