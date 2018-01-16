package BloombergOnsite;

public class longSubarray {
	public int longSubarray(int[] array){
		if(array == null || array.length == 0){
			return 0;
		}
		int max = 1;
		int length = 1;
		for(int i = 1 ; i < array.length ; i++){
			if(array[i] > array[i - 1]){
				length++;
			} else {
				max = Math.max(length, max);
				length = 1;
			}
		}
		max = Math.max(max, length);
		return max;
	}
}
