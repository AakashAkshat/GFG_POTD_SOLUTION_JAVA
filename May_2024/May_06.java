class Tree
{
    ArrayList<Integer> noSibling(Node node)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        helper(node, ans);
        Collections.sort(ans);

        if(ans.size()==0)
            ans.add(-1);

        return ans;
    }

    private void helper(Node root, ArrayList<Integer> ans)
    {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
            return;

        if(root.left==null)
            ans.add(root.right.data);
        else if(root.right==null)
            ans.add(root.left.data);

        helper(root.left, ans);
        helper(root.right, ans);
    }
}