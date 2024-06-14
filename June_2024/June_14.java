class Solution {
    static String armstrongNumber(int n) {
        // code here
        int num = n;
        
        int dig1 = num % 10;
        num = num / 10;
        
        int dig2 = num % 10;
        num = num / 10;
        
        int dig3 = num % 10;

        int armstrongNum = (dig1*dig1*dig1) + (dig2*dig2*dig2) + 
                            (dig3*dig3*dig3);
        
        if(armstrongNum == n)
            return "true";
        else
            return "false";
    }
}