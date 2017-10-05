import java.util.Arrays;

public class MergeeSort {
	public int[] mergeSort(int[] array) {
		// Write your solution here.
		if(array == null || array.length <= 1){
			return array;
		}
		int[] helper = new int[array.length];
		mergeSort(array , helper , 0 , array.length - 1);
		return array;
	}
	private void mergeSort(int[] array , int[] helper , int left , int right){
		if(left >= right){
			return;
		}
		int mid = left + (right - left) / 2;
		mergeSort(array , helper , left , mid);
		mergeSort(array , helper , mid + 1 , right);
		merge(array , helper , left , mid , right);
	}
	private void merge(int[] array , int[] helper , int left , int mid , int right){
		for(int i = left ; i <= right ; i++){
			helper[i] = array[i];
		}
		int leftindex = left;
		int rightindex = mid + 1;
		while(leftindex <= mid && rightindex <= right){
			if(helper[leftindex] <= helper[rightindex]){
				array[left++] = helper[leftindex++];
			}else{
				array[left++] = helper[rightindex++];
			}
		}
		while(leftindex <= mid){
			array[left++] = helper[leftindex++];
		}
	}

	public static void main(String[] args) {
		MergeeSort solution = new MergeeSort();

		int[] array = null;
		array = solution.mergeSort(array);
		System.out.println(Arrays.toString(array));

		array = new int[0];
		array = solution.mergeSort(array);
		System.out.println(Arrays.toString(array));

		array = new int[] { 1, 2, 3, 4 };
		array = solution.mergeSort(array);
		System.out.println(Arrays.toString(array));

		array = new int[] { 4, 3, 2, 1 };
		array = solution.mergeSort(array);
		System.out.println(Arrays.toString(array));

		array = new int[] { 2, 4, 1, 5, 3 };
		array = solution.mergeSort(array);
		System.out.println(Arrays.toString(array));

	}
}
