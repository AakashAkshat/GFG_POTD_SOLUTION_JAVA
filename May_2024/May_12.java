class Solution 
{
    static int minSteps(int d) 
    {
        // code here
        int res = steps(d, 0, 0);
        return res;
    }

    private static int steps(int d, int i, int j)
    {
        if(i-d >= 0 && (i-d)%2 == 0)
            return j;

        j++;
        return steps(d, i+j, j);
    }
}