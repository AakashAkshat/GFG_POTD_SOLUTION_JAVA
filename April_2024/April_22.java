class Solution {
    int minRow(int n, int m, int a[][]) {
        // code here
        int res=1;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==1)
                {
                    count++;
                }
            }

            int minn= Math.min(count, min);
            if(minn!=min)
            {
                res=i+1;
                min=minn;
            }
        }
        return res;
    }
};