class Solution
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
	// Your code here	
	    if(k == 1)
	        return null;
	    
	    Node curr = head;
	    Node prev = null;
	    
	    while(curr != null && curr.next != null) {
	        for(int i=1; i<k; i++) {
	            prev = curr;
	            curr = curr.next;
	            if(curr == null)
	                break;
	        }
	        if(curr == null)
	                break;
	        prev.next = curr.next;
	        curr = prev.next;
	    }
	    
	    return head;
    }
}