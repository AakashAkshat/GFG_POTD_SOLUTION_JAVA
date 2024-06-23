class Solution
{
    ArrayList<Integer> bracketNumbers(String str)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int i = 1;
        for(char ch : str.toCharArray())
        {
            if(ch=='(')
            {
                st.push(i++);
                list.add(st.peek());
            }
            else if(!st.isEmpty() && ch == ')' )
            {
                list.add(st.pop());
            }
        }    

        return list;
    }
};