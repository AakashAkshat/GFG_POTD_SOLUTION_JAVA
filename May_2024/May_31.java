class Solution {
    static int swapNibbles(int n) {
        // code here
        return ((n & 0x0F) << 4 | (n & 0xF0) >> 4);
    }
}