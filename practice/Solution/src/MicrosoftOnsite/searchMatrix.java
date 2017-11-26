package MicrosoftOnsite;

public class searchMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        if(target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]) {
            return false;
        }
        int left = 0;
        int right = matrix.length * matrix[0].length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(matrix[mid / matrix[0].length][mid % matrix[0].length] == target) {
                return true;
            } else if (matrix[mid / matrix[0].length][mid % matrix[0].length] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
