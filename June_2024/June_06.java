class Solution 
{
    long max_sum(int a[], int n) 
    {
        // Your code here
        long totalSum = 0;
        long currentConfigurationSum = 0;

        for (int i = 0; i < n; i++) 
        {
            totalSum += a[i];
            currentConfigurationSum += i * (long) a[i];
        }

        long maxSum = currentConfigurationSum;

        for (int i = 1; i < n; i++) 
        {
            currentConfigurationSum = currentConfigurationSum - totalSum + a[i - 1] * (long) n;
            maxSum = Math.max(maxSum, currentConfigurationSum);
        }

        return maxSum;
    }
}