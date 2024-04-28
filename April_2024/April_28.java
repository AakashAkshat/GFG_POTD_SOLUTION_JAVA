class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        
        if(head.next == null)
            return null;
        
        Node fast = head;
        Node slow = head;
        Node prev = slow;
        
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        
        prev.next = slow.next;
        
        return head;
    }
}