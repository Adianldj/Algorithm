package DP;

public class LargestWaterStorage {
	public int largest(int[] array){
		if(array == null || array.length == 0){
			return 0;
		}
		int left = 0;
		int right = array.length - 1;
		int leftmax = array[0];
		int rightmax = array[array.length - 1];
		int result = 0;
		while(left <= right){
			leftmax = Math.max(array[left], leftmax);
			rightmax = Math.max(array[right], rightmax);
			if(leftmax <= rightmax){
				result = result + leftmax - array[left];
				left++;
			}else{
				result = result + rightmax - array[right];
				right--;
			}
		}
		return result;
	}
}
