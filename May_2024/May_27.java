class Solution {
    public static int longestSubseq(int n, int[] a) {
        // code here
        int ans = 1;
        int res[] = new int[1002];
        for(int i : a)
        {
            res[i] = 1 + Math.max(res[i-1], res[i+1]);
            ans = Math.max(ans, res[i]);
        }
        return ans;
    }
}
