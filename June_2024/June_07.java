class Solution 
{
    // Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int n, int l[], int r[], int maxx) 
    {
        int[] arr = new int[maxx+2];

        for (int i=0; i<n; i++)
        {
            arr[l[i]]++;
            arr[r[i]+1]--;   
        }

        int maxfreq = arr[0];
        int result = 0;

        for (int i=1; i<=maxx; i++)
        {
            arr[i] += arr[i-1];
            if (arr[i] > maxfreq)
            {
                maxfreq = arr[i];
                result = i;
            }
        }

        return result;
    }
}