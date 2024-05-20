class Solution
{
    public long PowMod(long x, long n, long m)
    {
        // Code here
        long res = 1;
        x %= m;

        if(x == 0)
            return 0;

        while(n > 0) 
        {
            if((n&1) != 0)
                res = (res * x) % m;

            n = n >> 1;
            x = (x * x) % m;
        }

        return res;
    }
}
