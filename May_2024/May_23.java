class Solution 
{
    public int kPalindrome(String str, int n, int k) 
    {
        // code here
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++)
            dp[i][i] = 1;

        for (int len = 2; len <= n; len++)
        {
            for (int i = 0; i <= n - len; i++) 
            {
                int j = i + len - 1;
                if (str.charAt(i) == str.charAt(j))
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                else
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
            }
        }

        int lpsLength = dp[0][n - 1];

        return (n - lpsLength <= k) ? 1 : 0;
    }
}