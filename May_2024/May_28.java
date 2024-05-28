class Solution 
{
    public static int minimumCost(int n, int w, int[] cost) 
    {
        // code here
        int dp[][] = new int [n][w+1];
        for(int i[] : dp)
            Arrays.fill(i, -1);
        return solve(0, cost, w, dp);
    }

    private static int solve(int i, int []arr, int w, int dp[][])
    {
        if(w==0)
            return 0;

        if(w<0||i>=arr.length)
            return 100000;

        if(dp[i][w]!=-1)
            return dp[i][w];

        return dp[i][w] = Math.min(solve(i+1, arr, w, dp), arr[i] + solve(i, arr, w-(i+1), dp));
    }
}