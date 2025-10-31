class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;      
        int n = matrix[0].length;    

        
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix[i][j];
            }
        }

        
        for (int col = 0; col < n; col++) {
            
            int maxVal = Integer.MIN_VALUE;
            for (int row = 0; row < m; row++) {
                if (matrix[row][col] != -1) {
                    maxVal = Math.max(maxVal, matrix[row][col]);
                }
            }

            
            for (int row = 0; row < m; row++) {
                if (matrix[row][col] == -1) {
                    result[row][col] = maxVal;
                }
            }
        }

        return result;
    }
}
