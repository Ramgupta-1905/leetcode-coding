/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        Map<Node,Node> map = new HashMap<>();
        int index =0;
        Node head2 = new Node(head.val);
        Node curr = head2;
        map.put(head,head2);
        Node curr1 = head.next;
        while(curr1!=null){
            Node temp = new Node(curr1.val);
            curr.next = temp;
            map.put(curr1,temp);
            curr = curr.next;
            curr1 = curr1.next;
            index++;
        }
        curr = head2;
        curr1 = head;
        while(curr!=null){
            if(curr1.random == null)
                curr.random = null;
            else
                curr.random = map.get(curr1.random);
            curr = curr.next;
            curr1 = curr1.next;
        }
        return head2;
    }
}