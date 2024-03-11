//Count pairs Sum in matrices
//Time complexity: O(N^2)
//Space Complexity: O(1)

public class March_11 {
    class Solution {
        int countPairs(int mat1[][], int mat2[][], int n, int x) {
            // find the total elements
            int totalSize = n*n;
            // take the first pointer to iterate first matrix
            int first = 0;
            // take the second pointer to iterate second matrix
            int second = totalSize-1;
            // to store ans
            int countPairs = 0;
            
            while(first < totalSize && second >= 0) {
                int sum = mat1[first/n][first%n] + mat2[second/n][second%n];
                
                if(sum == x) {
                    first++;
                    second--;
                    countPairs++;
                }
                else if(sum < x) {
                    first++;
                }
                else {
                    second--;
                }
            }
            
            return countPairs;
        }
    }
}
