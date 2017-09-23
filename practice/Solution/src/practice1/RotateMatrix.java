package practice1;



public class RotateMatrix {
	public int[][] rotate(int[][] matrix){
		if(matrix == null || matrix.length == 0  || matrix[0].length == 0){
			return matrix;
		}
		int n = matrix.length;
		int m = matrix[0].length;
	
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < i ; j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < m / 2 ; j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][m - 1 - j];
				matrix[i][m - 1 - j] = temp;
			}
		}
		return matrix;
	}
	public static void main(String[] args) {
		RotateMatrix solution = new RotateMatrix();
		
		int[][] result;
        int[][] matrix;

		matrix = new int[][] {{ 1 , 2 , 3} ,  {8 , 9 , 4} ,{7 , 6 , 5}};
		result = solution.rotate(matrix);
		for(int i = 0 ; i < result.length ; i++){
			for(int j = 0 ; j < result[0].length ; j++){
				System.out.println(result[i][j]);
			}
		}
	

	}
}
