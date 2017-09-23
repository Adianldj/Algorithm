package binarySearch;

public class searchInMatrix {
   public int[] search(int[][] matrix , int target){
	   int[] result = new int[]{-1 , -1};
	   if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
		   return result;
	   }
	   int m = matrix.length , n = matrix[0].length;
	   int left = 0 , right = m * n - 1;
	   while(left <= right){
		   int mid = left + (right - left) / 2;
		   int row = mid / n;
		   int col = mid % n;
		   if(matrix[row][col] ==  target){
			   result[0] = row;
			   result[1] = col;
			   return result;
		   }else if(matrix[row][col] < target){
			   left = mid + 1;
		   }else{
			   right = mid - 1;
		   }
	   }
	   return result;
   }
	public static void main(String[] args) {
		searchInMatrix solution = new searchInMatrix();
		int target = 5;
		int[] result;
        int[][] matrix;

		matrix = new int[][] {{ 0, 1, 2, 4 } ,  {5, 6 , 7 , 8 }};
		result = solution.search(matrix, target);
		System.out.println(result);

	}
}
