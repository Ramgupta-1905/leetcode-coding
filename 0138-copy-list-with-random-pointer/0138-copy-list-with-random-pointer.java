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
        Node head2 = new Node(head.val);
        map.put(head,head2);
        Node curr1 = head.next;
        Node curr = head2;

        while(curr1!=null){
            Node temp = new Node(curr1.val);
            curr.next = temp;
            map.put(curr1,temp);
            curr = curr.next;
            curr1 = curr1.next;
        }

        curr1 = head;
        curr = head2;
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