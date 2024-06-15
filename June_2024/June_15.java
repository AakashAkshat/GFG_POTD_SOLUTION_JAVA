class Solution {
    public long getCount(int n) {
        // Your code goes here
        long[][] dp = new long[n][10];
        for(int i=0;i<10;i++)
        {
            dp[0][i] = 1;
        }
        for(int i=1;i<n;i++)
        {
            dp[i][0] = dp[i-1][0]+dp[i-1][8];
            dp[i][1] = dp[i-1][1]+dp[i-1][2]+dp[i-1][4];
            dp[i][2] = dp[i-1][2]+dp[i-1][3]+dp[i-1][1]+dp[i-1][5];
            dp[i][3] = dp[i-1][2]+dp[i-1][6]+dp[i-1][3];
            dp[i][4] = dp[i-1][1]+dp[i-1][5]+dp[i-1][7]+dp[i-1][4];
            dp[i][5] = dp[i-1][2]+dp[i-1][4]+dp[i-1][6]+dp[i-1][8]+dp[i-1][5];
            dp[i][6] = dp[i-1][3]+dp[i-1][5]+dp[i-1][6]+dp[i-1][9];
            dp[i][7] = dp[i-1][4]+dp[i-1][7]+dp[i-1][8];
            dp[i][8] = dp[i-1][5]+dp[i-1][7]+dp[i-1][8]+dp[i-1][0]+dp[i-1][9];
            dp[i][9] = dp[i-1][9]+dp[i-1][8]+dp[i-1][6];
        }
        long sum = 0;
        for(int i=0;i<10;i++)
        {
            sum = sum+dp[n-1][i];
        }
        return sum;
    }
}