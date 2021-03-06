package practice1;

import java.util.Arrays;

public class ArrayDuplication3 {
	public int[] deDup(int[] array){
		if(array == null || array.length <= 1){
			return array;
		}
		int slow = 0;
		int fast = 0;
		while(fast < array.length){
			int begin = fast;
			while(fast < array.length && array[fast] == array[begin]){
				fast++;
			}
			if(fast - begin == 1){
				array[slow++] = array[begin];
			}
			
			
		}
		return Arrays.copyOf(array, slow);
	}
	public static void main(String[] args) {
		ArrayDuplication3 solution = new ArrayDuplication3();

	

		int[] array = new int[] { 1, 2,2,2, 3, 4 , 4 ,4};
		array = solution.deDup(array);
		System.out.println(Arrays.toString(array));


	}
}
