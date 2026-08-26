/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(intval, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        Stack<int[]> stack = new Stack<>();
        ListNode curr = head.next;
        int[] main = new int[2];
        main[0] = head.val;
        main[1] = 0;
        stack.push(main);

        int count =0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int[] res = new int[count];
        int i =1;
        while(curr!=null){
            if(!stack.isEmpty() && curr.val > stack.peek()[0]){
                while(!stack.isEmpty() && curr.val > stack.peek()[0]){
                   int[] tem =  stack.pop();  
                   res[tem[1]] = curr.val;    
                }
                int[] pes = {curr.val,i++};
                stack.push(pes);
            }
            else{
                int[] pes = {curr.val,i++};
                stack.push(pes);
            }
            curr = curr.next;
        }
        return res;
    }
}