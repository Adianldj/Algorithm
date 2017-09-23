package practice1;



import java.util.Arrays;

public class ArrayDuplication1 {
	public int[] arrayduplicate(int[] array){
		if(array == null){
			return null;
		}
		if(array.length == 0){
			return new int[0];
		}
		if(array.length == 1){
			return array;
		}
		int slow = 0;
		for(int fast = 1 ; fast < array.length ; fast++){
			if(array[slow] != array[fast]){
				array[++slow] = array[fast];
			}else{
				continue;
			}
		}
		return Arrays.copyOf(array, slow + 1);
	}
	public static void main(String[] args) {
		ArrayDuplication1 solution = new ArrayDuplication1();

		int[] array;

		array = new int[] { 1, 2,2, 3, 4 , 4};
		array = solution.arrayduplicate(array);
		System.out.println(Arrays.toString(array));


	}
}
