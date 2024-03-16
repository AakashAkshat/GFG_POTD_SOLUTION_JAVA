import org.w3c.dom.Node;

public class March_16 {
    class Solution
{
    void deleteNode(Node del_node)
    {
         // Your code here
         // copy the value of next node to del_node
         del_node.data = del_node.next.data;
         // delete the next node
         del_node.next = del_node.next.next;
         
    }
}

    
}
