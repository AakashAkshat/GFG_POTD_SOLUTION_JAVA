// 10th March, 2024 Solution in JAVA
// Time Complexity: O(N)
// Space Complexity: O(N)

class Solution {
    String removeDuplicates(String str) {
        int[] arr = new int[58];
        StringBuilder ans = new StringBuilder();
        
        for(char c : str.toCharArray()) {
            if(arr[c - 'A'] == 0) {
                ans.append(c);
                arr[c-'A']++;
            }
        }
        
        return ans.toString();
    }
}