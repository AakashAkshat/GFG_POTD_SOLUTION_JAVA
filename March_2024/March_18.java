import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class March_18 {
    class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        if(root == null) {
            return ans;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            ans.add(node.data);
            
            if(node.left != null) {
                queue.offer(node.left);
            }
            
            if(node.right != null) {
                queue.offer(node.right);
            }
        }
        
        return ans;
    }
}
    
}
