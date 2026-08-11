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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return null;
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode curr1 = list1;
        if(list1.val <list2.val){
            curr1 = list1.next;
            list1.next = list2;
            list2 = list1;
        }
        ListNode curr2 = list2;
        while(curr1 != null || curr2 !=null){
            if(curr1 == null){
                return list2;
            }
            if(curr2.next == null){
                curr2.next = curr1;
                return list2;
            }
            ListNode temp = curr2.next;
            while(temp != null && curr1.val > temp.val){
                curr2 = curr2.next;
                temp = temp.next;
            }
            if(curr1.val >= curr2.val){
                ListNode next = curr1.next;
                curr1.next = curr2.next;
                curr2.next = curr1;
                curr1 = next;
            }
            curr2 = curr2.next;
        }
        return list2;
    }
}