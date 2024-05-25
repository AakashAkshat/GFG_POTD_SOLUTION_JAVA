class Solution {
    long max_Books(int arr[], int n, int k) {
        // Your code here
        long curr=0;
        long max=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]<=k)
            {
                curr += arr[i];
                max = Math.max(max,curr);
            }
            else
                curr=0;
        }
        return max;
    }
}