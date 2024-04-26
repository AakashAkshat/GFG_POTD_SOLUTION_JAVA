class Solution {
    public int[] FindExitPoint(int n, int m, int[][] matrix) 
    {
        // code here
        int i = 0, j = 0, currentDirection = 0;
        int[][] directions = { {0, 1}, {1, 0}, {0, -1}, {-1, 0} }; 

        while(i >= 0 && i < n && j >= 0 && j < m) 
        {
            if(matrix[i][j] == 0) 
            {
                i += directions[currentDirection][0];
                j += directions[currentDirection][1];  
            }
            else 
            {
                matrix[i][j] = 0;
                currentDirection++;
                currentDirection %= 4;
                i += directions[currentDirection][0];
                j += directions[currentDirection][1];
            }
        }

        i -= directions[currentDirection][0];
        j -= directions[currentDirection][1];

        return new int[] { i, j };
    }
}