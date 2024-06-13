class Solution
{
    int mod = 1000000007;
    public int padovanSequence(int n)
    {
        //code here.
        if (n < 3)
            return 1;

        int a=1, b=1, c=1, d=1;
        for (int i=3; i<=n; i++)
        {
            d = (a + b)%mod;
            a = b;
            b = c;
            c = d;
        }
        return d;
    }

}
