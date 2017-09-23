package practice1;

import java.util.Arrays;

public class LargestSmallest {
	public int[] largestsmallest(int[] array){
		int[] result = new int[2];
		int n = array.length;
		for(int i = 0 ; i < n / 2; i++){
			if(array[i] < array[n - 1 - i]){
				swap(array , i , n - 1 - i);
			}
		}
		result[0] = findLarge(array , 0 , (n - 1) / 2);
		result[1] = findSmall(array , n / 2  , n - 1);
		return result;
	}
	private int findLarge(int[] array , int start , int end){
		int large = array[start];
		for(int i = start + 1 ; i <= end ; i++){
			large = Math.max(large, array[i]);
		}
		return large;
	}
	private int findSmall(int[] array , int start , int end){
		int small = array[start];
		for(int i = start + 1 ; i <= end ; i++){
			small = Math.min(small, array[i]);
		}
		return small;
	}
	private void swap(int[] array , int i , int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	public static void main(String[] args) {
		LargestSmallest solution = new LargestSmallest();

	    int[] array = new int[] {3,5,2,2,1,6,3,4,5};
		array = solution.largestsmallest(array);
		System.out.println(Arrays.toString(array));


	}
}
