class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
    
        int[] res=new int[query.length];

        for(int i=0;i<query.length;i++)
        {
            int count=0;
            int k = a[query[i]];
            for(int j=0;j<n;j++)
            {
                if(b[j]<=k) count++;
            }
            res[i]=count;
        }
        return res;
    }
}
