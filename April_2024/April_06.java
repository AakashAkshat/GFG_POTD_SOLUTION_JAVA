class Solution {
    
    // Function to count number of ways to reach the nth stair
    // when order does not matter.
    Long countWays(int n) {
        // your code here
        return (long) (1 + (n / 2));
    }
}
