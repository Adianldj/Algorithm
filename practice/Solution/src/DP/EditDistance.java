package DP;

public class EditDistance {
	public int transferString(String one , String two){

		int n = one.length();
		int m = two.length();
		int[][] matrix = new int[n + 1][m + 1];
		for(int i = 0 ; i <= n ; i++){
			for(int j = 0 ; j <= m ; j++){
				if(i == 0){
					matrix[i][j] = j;
				}else if(j == 0){
					matrix[i][j] = i;
				}else if(one.charAt(i - 1) == two.charAt(j - 1)){
					matrix[i][j] = matrix[i - 1][j - 1];
				}else{
					matrix[i][j] = Math.min(matrix[i - 1][j], matrix[i][j - 1]);
					matrix[i][j] = Math.min(matrix[i][j] , matrix[i - 1][j - 1]);
					matrix[i][j] = matrix[i][j] + 1;
				}
			}
		}
		return matrix[one.length()][two.length()];
	}
}
