class Solution
{
	public int maxDotProduct(int n, int m, int a[], int b[]) 
	{ 
		// Your code goes here
		int[][] ans = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) 
        {
            for (int j = i; j <= n; j++) 
            {
                ans[i][j] = Math.max(ans[i - 1][j - 1] + a[j - 1] * b[i - 1], ans[i][j - 1]);
            }
        }

        return ans[m][n];
	} 
}
