class Solution {
    
    public Node arrangeCV(Node head){
        //write code here and return the head of changed linked list
        Node vow = new Node('0');
        Node currVow = vow;
        
        Node cons = new Node('0');
        Node currCons = cons;
        
        while(head != null) {
            if(head.data == 'a' || head.data == 'e' || head.data == 'i'
                || head.data == 'o' || head.data == 'u') {
                    currVow.next = new Node(head.data);
                    currVow = currVow.next;
                }
            else {
                currCons.next = new Node(head.data);
                currCons = currCons.next;
            }
            
            head = head.next;
        }
        
        currVow.next = cons.next;
        
        return vow.next;
    }
}