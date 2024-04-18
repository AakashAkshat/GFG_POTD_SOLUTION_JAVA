class Solution
{
    //Function to find two repeated elements.
    public int[] twoRepeated(int arr[], int n)
    {
        // Your code here
        Set<Integer> set = new HashSet<>();

        int[] ans = new int[2];
        int j=0;
        for(int i=0;i<n+2;i++)
        {
            if(set.contains(arr[i]) && j!=2)
            {
                ans[j]= arr[i];
                j++;

            }

            else
            {
                set.add(arr[i]);
            }
        }
        return ans;
    }
    
}