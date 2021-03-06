package DP;

public class LargestSquare {
	public int Square(int[][] matrix){
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
			return 0;
		}
		int max = 0;
		int[][] result = new int[matrix.length][matrix[0].length];
		for(int i = 0 ; i < matrix.length ; i++){
			for(int j = 0 ; j < matrix[0].length ; j++){
				if(i == 0){
					result[i][j] = matrix[i][j] == 1? 1 : 0;
				}else if(j == 0){
					result[i][j] = matrix[i][j] == 1? 1 : 0;
				}else if(matrix[i][j] == 1){
					result[i][j] = Math.min(result[i - 1][j], result[i][j - 1]);
					result[i][j] = Math.min(result[i][j], result[i - 1][j - 1]);
					result[i][j] = result[i][j] + 1;
				}
				max = Math.max(max, result[i][j]);
			}
		}
		return max;
	}
}
