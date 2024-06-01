class Solution 
{
    public static String oddEven(String s) 
    {
        // code here
        int a[] = new int[27];
        for(int i=0; i<s.length(); i++)
            a[s.charAt(i)-'a' + 1]++;

        int x=0, y=0;

        for(int i=1; i<=26; i++)
        {
            if(a[i]!=0 && (i%2==0 && a[i]%2==0))
                x++;
            if(a[i]!=0 && (i%2!=0 && a[i]%2!=0))
                y++;
        }

        return (x+y)%2 == 0 ? "EVEN" : "ODD";
    }
}
