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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode res = new ListNode();
        int carry =0;
        ListNode temp = res;
        while(curr1 !=null || curr2!=null || carry ==1){
            int num1=0;
            int num2 =0;
            if(curr1 != null)
                 num1 = curr1.val;
            if(curr2 != null)
                 num2 = curr2.val;
            int sum  = num1+num2+carry;
            temp.val = sum%10;
            carry = sum/10;
            if(curr1 !=null)
            curr1 = curr1.next;
            if(curr2 != null)
            curr2 = curr2.next;
            if (curr1 != null || curr2 != null || carry != 0){
                temp.next = new ListNode();
                temp = temp.next;
              }
        }
        return res;
    }
}