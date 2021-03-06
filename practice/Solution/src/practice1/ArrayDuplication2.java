package practice1;

import java.util.Arrays;

public class ArrayDuplication2 {
	public int[] deDup(int[] array){
		if(array == null){
			return null;
		}
		if(array.length <= 1){
			return array;
		}
		int slow = 1;
		for(int fast = 2 ; fast < array.length ; fast++){
			if(array[fast] == array[slow - 1]){
				continue;
			}else{
				array[++slow] = array[fast];
			}
		}
		return Arrays.copyOf(array , slow + 1);
	}
	public static void main(String[] args) {
		ArrayDuplication2 solution = new ArrayDuplication2();

		int[] array;

		array = new int[] { 1, 2,2,2, 3, 4 , 4 ,4};
		array = solution.deDup(array);
		System.out.println(Arrays.toString(array));


	}
}
