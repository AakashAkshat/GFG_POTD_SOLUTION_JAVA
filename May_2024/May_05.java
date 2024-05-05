class Solution
{
    public ArrayList <Integer> verticalSum(Node root) 
    {
        // add your code here
        TreeMap<Integer,Integer> map = new TreeMap<>();

        helper(root,map,0);

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i: map.keySet())
            ans.add(map.get(i));

        Collections.reverse(ans);

        return ans;
    }

    private void helper(Node root, TreeMap<Integer,Integer>map, int cur)
    {
        if(root == null)
            return;

        map.put(cur, map.getOrDefault(cur,0) + root.data);

        helper(root.left, map,cur+1);
        helper(root.right, map,cur-1);
    }
}