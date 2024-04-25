class Solution 
{
    int findMaxSum(int n, int m, int mat[][]) 
    {
        // code here
        int maxSum = -1;
        for(int i=1;i<n-1;i++)
        {
            for(int j = 1; j< m-1; j++)
            {
                int sum = mat[i][j] + mat[i-1][j] + mat[i+1][j] +
                            mat[i-1][j-1] + mat[i-1][j+1] +
                            mat[i+1][j-1] + mat[i+1][j+1];

                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
};