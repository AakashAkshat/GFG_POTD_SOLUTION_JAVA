class Solution {
    // Function to find the minimum element in the given BST.
    int minValue(Node root) {
        // code here
        if(root == null)
            return -1;
        int min = Integer.MAX_VALUE;
        int minValue = helper(root, min);
        
        return minValue;
    }
    
    int helper(Node node, int min) {
        
        if(node == null) {
            return min;
        }
        
        if(node.data < min) {
            min = node.data;
        }
        
        int leftMin = helper(node.left, min);
        int rightMin = helper(node.right, min);
        
        return Math.min(leftMin, rightMin);
    }
}
