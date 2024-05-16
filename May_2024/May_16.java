class Solution 
{
    public int minimumEdgeRemove(int n, int[][] edges) 
    {
        // code here
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=1; i<=n+1; i++)
            map.put(i, new ArrayList<>());

        for(int [] edge : edges)
        {
            List<Integer> list = map.getOrDefault(edge[0], new ArrayList<>());
            list.add(edge[1]);
            map.put(edge[0], list);
            list = map.getOrDefault(edge[1], new ArrayList<>());
            list.add(edge[0]);
            map.put(edge[1], list);
        } 

        boolean [] vis = new boolean[n+1];
        int [] ans = new int[1];

        dfs(1, map, vis, ans);

        return ans[0];
    }


    private int dfs(int root, Map<Integer, List<Integer>> map, boolean[] vis, int[] ans)
    {
        vis[root] = true;
        int len = 1;
        for(int child : map.get(root))
        {
            if(vis[child] == false)
            {
                int res = dfs(child, map, vis, ans);

                if(res % 2 == 0)
                    ans[0]++;
                else
                    len += res;
            }
        }

        return len;
    }
}