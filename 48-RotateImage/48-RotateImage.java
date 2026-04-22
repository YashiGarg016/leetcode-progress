// Last updated: 23/04/2026, 00:07:03
class Solution {
    public void rotate(int[][] matrix) {
        int edge = matrix.length;
        int top = 0;
        int bottom = edge - 1;

        //step 1: vertical flipping
        while(top < bottom){
            for(int col = 0; col < edge; col++){
                int temp = matrix[top][col];
                matrix[top][col] = matrix[bottom][col];
                matrix[bottom][col] = temp;
            }
            top++;
            bottom--;
        }

        //step 2: transpose
        for(int row = 0; row < edge; row++){
            for(int col = row + 1; col < edge; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
    }
}