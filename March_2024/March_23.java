class Solution {

    int[] Series(int n) {
        // code here
        
        int[] ansArray = new int[n+1];
        ansArray[0] = 0;
        ansArray[1] = 1;
        
        for(int i=2; i<=n; i++) {
            ansArray[i] = (ansArray[i-2] + ansArray[i-1])%((int)Math.pow(10, 9) + 7);
        }
        
        return ansArray;
    }
}