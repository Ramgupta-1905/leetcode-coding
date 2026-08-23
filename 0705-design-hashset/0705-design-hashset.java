public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  
class MyHashSet {
    public MyHashSet() { 
    }

    ListNode head = null;
    public void add(int key) {
        if(head == null){
            head = new ListNode(key);
            return;
    }
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            if(curr.val == key)
                return;
            prev= curr;
            curr = curr.next;
        }
        prev.next = new ListNode(key);
    }
    
    public void remove(int key) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            if(curr.val == key){
                if(prev != null){
                prev.next = curr.next;
                }
                else{
                    head = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
    
    public boolean contains(int key) {
        ListNode curr = head; 
        while(curr != null){
            if(curr.val == key)
                return true;;
            curr = curr.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */