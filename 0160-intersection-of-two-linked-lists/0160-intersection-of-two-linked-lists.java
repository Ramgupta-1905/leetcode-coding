/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> list = new HashSet<>();
        
        ListNode curr1 =headA;
        ListNode curr2 = headB;
        while(curr1!=null || curr2 != null){
            if(curr1 != null){
            if(list.contains(curr1)){
                return curr1;
            }
            else{
                list.add(curr1);
            }
            curr1 = curr1.next;
            }
            if(curr2 !=null){
            if(list.contains(curr2)){
                return curr2;
            }
            else{
                list.add(curr2);
            } 
            curr2 = curr2.next;
            }
        }
        return null;
    }
}