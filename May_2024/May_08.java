class Solution {
    private static void helper(Node root, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> ans)
    {
        if(root==null)
            return;

        temp.add(root.data);

        if(root.left==null && root.right==null)
            ans.add(new ArrayList<>(temp));

        helper(root.left, temp, ans);
        helper(root.right, temp, ans);

        temp.remove(temp.size()-1);
    }

    public static ArrayList<ArrayList<Integer>> Paths(Node root) 
    {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helper(root, new ArrayList<>(), ans);
        return ans;
    }