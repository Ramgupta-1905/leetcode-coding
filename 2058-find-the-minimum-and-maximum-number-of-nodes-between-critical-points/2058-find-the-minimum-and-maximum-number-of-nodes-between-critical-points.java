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
        ArrayList<Integer> list = new ArrayList<>();
        while(next!= null){
            if(curr.val<prev.val && curr.val < next.val){
                list.add(k);
            }
            if(curr.val > prev.val && curr.val > next.val){
            list.add(k);
            }
            k++;
            prev = curr;
            curr = next;
            next = next.next;
        }
        for(int i =0;i<list.size()-1;i++){
            int distance = Math.abs(list.get(i) - list.get(i+1));
            min = Math.min(min,distance);
        }
        if(list.size() <2)
            return res;
        res[0] = min;
        res[1] = list.get(list.size()-1) - list.get(0);
        return res;
    }
}