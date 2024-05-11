class Solution {
    static List<Integer> jugglerSequence(int n) {
        // code here
        
        List<Integer> ans = new ArrayList<Integer>();
        ans.add(n);
        
        while(n != 1) {
            if(n % 2 == 0) {
                n = (int)Math.pow(n, 0.5);
                ans.add(n);
            }
            
            else {
                n = (int)Math.pow(n, 1.5);
                ans.add(n);
            }
        }
        
        return ans;
    }
}