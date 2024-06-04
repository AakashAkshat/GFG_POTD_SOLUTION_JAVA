class Solution {
    String binaryNextNumber(String s) {
        // code here.
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb1 = new StringBuilder("1");
        int i = sb.length()-1; 

        while(i>=0 && sb.charAt(i) == '1')
        {
            sb.setCharAt(i, '0');
            i--;
        }
        if(i<0)
           sb.insert(0,"1");
        else
           sb.setCharAt(i, '1');

       int index = sb.indexOf("1");
       return sb.substring(index).toString();
    }
}