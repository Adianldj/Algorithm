package BloombergOnsite;

public class secondLargest {
	public int secondLarge(int[] array){
		if(array == null || array.length <= 1){
			return -1;
		}
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for(int i = 0 ; i < array.length ; i++){
			if(array[i] > first){
				first = array[i];
				second = first;
			} else if(array[i] > second && array[i] != first){
				second = array[i];
			}
		}
		if(second == Integer.MIN_VALUE){
			return -1;
		} else {
			return second;
		}
	}
}
