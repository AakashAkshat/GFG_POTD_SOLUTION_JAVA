
class Solution
{
    public static ArrayList<Integer> getPrimes(int n)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(-1);
        for (int i=2; i<n; i++)
        {
            if (isPrime(i) && isPrime(n-i))
            {
                list.set(0, i);
                list.set(1, n-i);
                break;
            }
        }

        return list;
    }

    public static boolean isPrime(int n)
    {
        if (n==0 || n==1)
            return false;
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}