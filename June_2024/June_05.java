
class Solution 
{
    long findSwapValues(long a[], int n, long b[], int m) 
    {
        // Your code goes here
        Set<Long> set = new HashSet<>();

        long aSum = Arrays.stream(a).sum();
        long bSum = Arrays.stream(b).sum();
        long diff = Math.abs(aSum - bSum);

        if (diff == 0)
            return 1;

        if ((aSum + bSum) % 2 == 1)
            return -1;

       for (int i=0; i<a.length; i++)
           set.add(a[i]);

       for (int i=0; i<b.length; i++)
           if (set.contains(diff-b[i]))
            return 1;

        return -1;
    }
}