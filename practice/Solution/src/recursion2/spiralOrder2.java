package recursion2;

import java.util.ArrayList;
import java.util.List;

public class spiralOrder2 {
	public List<Integer> spiral(int[][] matrix) {
		List<Integer> result = new ArrayList<Integer>();

		int m = matrix.length;
		if(m == 0){
			return result;
		}
		int n = matrix[0].length;
		if(n == 0){
			return result;
		}
		int left = 0 , right = n - 1;
		int top = 0 , down = m - 1;
		//int num = 1;
		while(left < right && top < down){
			for(int i = left ; i < right ; i++){
				result.add(matrix[top][i]);
			}
			for(int i = top ; i < down ; i++){
				result.add(matrix[i][right]);
			}
			for(int i = right ; i > left ; i--){
				result.add(matrix[down][i]);
			}
			for(int i = down ; i > top ; i--){
				result.add(matrix[i][left]);
			}
			left++;
			right--;
			top++;
			down--;
		}
		if(left > right && top > down){
			return result;
		}
		if(left == right){
			for(int i = top ; i <= down ; i++){
				result.add(matrix[i][left]);
			}
		}else{
			for(int i = left ; i <= right ; i++){
				result.add(matrix[top][i]);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		spiralOrder2 solution = new spiralOrder2();
		List<Integer> result;
        int[][] matrix = new int[][] {{ 0, 1, 2, 4 } ,  {5, 6 , 7 , 8 } , {9 , 10, 11 , 12}};
		result = solution.spiral(matrix);
		for(int i = 0 ; i < result.size() ; i++){
		  System.out.println(result.get(i));
		}
	}
}
