package DP;

public class LargestSubmatrix {
	public int largest(int[][] matrix){
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
			return 0;
		}
		int result = Integer.MIN_VALUE;

		int m = matrix[0].length;
		for(int i = 0 ; i < matrix.length ; i++){
			int[] cur = new int[m];
			for(int j = i ; j < matrix.length ; j++){
				add(cur , matrix[j]);
				result = Math.max(result, max(cur));
			}
		}
		return result;
	}
	private void add(int[] cur , int[] matrix){
		for(int i = 0 ; i < cur.length ; i++){
			cur[i] += matrix[i];
		}
	}
	private int max(int[] array){
		int cur = array[0];
		int max = array[0];
		for(int i = 1 ; i < array.length ; i++){
			if(cur <= 0){
				cur = array[i];
			}else{
				cur = cur + array[i];
			}
			max = Math.max(cur, max);

		}
		return max;
	}
}
