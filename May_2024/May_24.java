class Solution 
{
    public static int countPartitions(int n, int d, int[] arr) 
    {
        // code here
        int totalSum = 0;
        for (int num : arr)
            totalSum += num;

        if ((totalSum + d) % 2 != 0 || totalSum < d)
            return 0;

        int target = (totalSum + d) / 2;
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int num : arr)
            for (int i = target; i >= num; i--)
                dp[i] = (dp[i] + dp[i - num]) % 1000000007;

        return dp[target];
    }
}