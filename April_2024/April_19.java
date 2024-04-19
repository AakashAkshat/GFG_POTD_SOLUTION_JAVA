class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        Set<Integer> set = new HashSet<Integer>();
        
        for(int num : b) {
            set.add(num);
        }
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for(int num : a) {
            if(!set.contains(num)) {
                ans.add(num);
            }
        }
        
        return ans;
    }
}