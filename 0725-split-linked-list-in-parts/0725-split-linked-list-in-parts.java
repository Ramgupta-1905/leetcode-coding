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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode curr = head;
        int size = 0;

        // Find size
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        int parts = size / k;
        int extra = size % k;

        ListNode[] res = new ListNode[k];
        curr = head;

        for (int i = 0; i < k; i++) {

            // Starting node of this part
            res[i] = curr;

            int n = parts;

            if (extra > 0) {
                n++;
                extra--;
            }

            // Move to the end of this part
            for (int j = 1; j < n && curr != null; j++) {
                curr = curr.next;
            }

            // Disconnect this part
            if (curr != null) {
                ListNode next = curr.next;
                curr.next = null;
                curr = next;
            }
        }

        return res;
    }
}