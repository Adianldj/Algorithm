package MicrosoftOnsite;

public class searchInMatrix2 {
	public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null){
            return false;
        }
        int m = matrix.length;
        if(m == 0){
            return false;
        }
        int n = matrix[0].length;
        if(n == 0){
            return false;
        }
        int row = m - 1;
        int col = 0;
        while(row >= 0 && col < n){
            if(matrix[row][col] < target){
                col++;
            } else if (matrix[row][col] > target){
                row--;
            } else {
                return true;
            }
        }
        return false;
    }

}
