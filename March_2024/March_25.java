class Solution {
    ArrayList<String> NBitBinary(int N) 
    {
        // code here
        ArrayList<String> list = new ArrayList<>();
        solve("",0,0,N,list);
        return list;
    }

    void solve(String str,int oneC,int zero,int N,ArrayList<String> list)
    {
        if(str.length()==N)
        {
            list.add(str);
            return;
        }

        solve(str+"1", oneC+1,zero,N,list);

        if(zero < oneC)
        {
            solve(str+"0",oneC,zero+1,N,list);
        }
    }
}
