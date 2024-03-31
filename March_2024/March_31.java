class Solution {
    public static int findMaxForN(Node root, int n) {
        // Add your code here.
        if(root == null)
            return -1;
            
        int maxValue = -1;
        int ans = helper(root, maxValue, n);
        
        return ans;
    }
    
    private static int helper(Node node, int maxValue, int n) {
        if(node == null) {
            return maxValue;
        }
        
        if(node.key > maxValue && node.key <= n) {
            maxValue = node.key;
        }
        
        int leftMax = helper(node.left, maxValue, n);
        int rightMax = helper(node.right, maxValue, n);
        
        return Math.max(leftMax, rightMax);
    }

}