
class Solution{
    static int findSingle(int n, int arr[]){
        // code here
        
        // using xor operator
        int xor = 0;
        
        for(int num : arr) {
            xor = xor ^ num;
        }
        
        return xor;

    }
}