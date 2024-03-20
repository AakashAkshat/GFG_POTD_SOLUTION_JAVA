import org.w3c.dom.Node;

public class March_20 {
    class Solution {
    void solve(Node root, int len, int[] maxLen, int sum, int[] maxSum) {
        if (root == null) {
            if (len > maxLen[0]) {
                maxLen[0] = len;
                maxSum[0] = sum;
            } else if (len == maxLen[0]) {
                maxSum[0] = Math.max(sum, maxSum[0]);
            }
            return;
        }
        
        sum += root.data;
        
        solve(root.left, len + 1, maxLen, sum, maxSum);
        solve(root.right, len + 1, maxLen, sum, maxSum);
    }
    
    public int sumOfLongRootToLeafPath(Node root) {
        if (root == null) {
            return 0;
        }
        
        int len = 0;
        int[] maxLen = {0};
        int sum = 0;
        int[] maxSum = {0};
        
        solve(root, len, maxLen, sum, maxSum);
        
        return maxSum[0];
    }


}
    
}
