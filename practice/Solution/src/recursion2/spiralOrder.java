package recursion2;

import java.util.ArrayList;
import java.util.List;


public class spiralOrder {
	public List<Integer> spiral(int[][] matrix){
		List<Integer> result = new ArrayList<Integer>();
		int size = matrix.length;
		traverse(matrix , 0 , size , result);
		return result;
	}
	private void traverse(int[][] matrix , int offset , int size , List<Integer> result){
		if(size <= 0){
			return;
		}
		if(size <= 1){
			result.add(matrix[offset][offset]);
			return;
		}
		for(int i = 0 ; i < size - 1 ; i++){
			result.add(matrix[offset][offset + i]);
		}
		for(int i = 0 ; i < size - 1 ; i++){
			result.add(matrix[offset + i][offset + size - 1]);
		}
		for(int i = size - 1 ; i > 0 ; i--){
			result.add(matrix[offset + size - 1][offset + i]);
		}
		for(int i = size - 1 ; i > 0 ; i--){
			result.add(matrix[offset + i][offset]);
		}
		traverse(matrix , offset + 1 , size - 2 , result);
		
	}
	public static void main(String[] args) {
		spiralOrder solution = new spiralOrder();
		List<Integer> result;
        int[][] matrix = new int[][] {{ 0, 1, 2, 4 } ,  {5, 6 , 7 , 8 } , {9 , 10, 11 , 12} , {13 , 14 , 15 , 16}};
		result = solution.spiral(matrix);
		for(int i = 0 ; i < result.size() ; i++){
		  System.out.println(result.get(i));
		}
	}
}
