class Solution {
    public int findPair(int n, int x, int[] arr) {
        // code here
        Set<Integer> set = new HashSet<Integer>();
        
        for(int num : arr) {
            if(set.contains(num - x) || set.contains(num + x))
                return 1;
                
            set.add(num);
        }
        
        return -1;
    }
}