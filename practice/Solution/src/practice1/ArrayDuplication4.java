package practice1;

import java.util.Arrays;

public class ArrayDuplication4 {
	public int[] deDup(int[] array){
		if(array == null || array.length <= 1){
			return array;
		}
		int end = -1;
		for(int i = 0 ; i < array.length ; i++){
			if(end == -1 || array[end] != array[i]){
				array[++end] = array[i];
			}else{
				while(i < array.length - 1 && array[end] == array[i + 1]){
					i++;
				}
				end--;
			}
		}
		return Arrays.copyOf(array, end + 1);
	}
	public static void main(String[] args) {
		ArrayDuplication4 solution = new ArrayDuplication4();

	    int[] array = new int[] {1, 2, 3, 3, 3, 2, 2};
		array = solution.deDup(array);
		System.out.println(Arrays.toString(array));


	}
}
