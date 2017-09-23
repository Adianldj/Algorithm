package String;

import java.util.ArrayList;
import java.util.List;

public class CommonNumber {
	public List<Integer> commonNumber(int[] A , int[] B){
		List<Integer> result = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while(i < A.length && j < B.length){
			if(A[i] == B[j]){
				result.add(A[i]);
				i++;
				j++;
			}else if(A[i] < B[j]){
				i++;
			}else{
				j++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		CommonNumber solution = new CommonNumber();

		List<Integer> result;
		int[] array1;
		int[] array2;
		array1 = new int[] { 1, 2 , 4 };
		array2 = new int[] {1 , 2 , 5 ,6 , 7};
		
		result = solution.commonNumber(array1 , array2);
		System.out.println(result);

	

	}
}
