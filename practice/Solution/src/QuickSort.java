import java.util.Arrays;

public class QuickSort {
	public int[] quickSort(int[] array) {
		// Write your solution here
		if(array == null || array.length <= 1){
			return array;
		}
		quicksort(array , 0 , array.length - 1);
		return array;
	}
	private void quicksort(int[] array , int left , int right){
		if(left >= right){
			return;
		}
		int pivo = Partition(array , left , right);
		quicksort(array , left , pivo - 1);
		quicksort(array , pivo + 1 , right);
	}
	private int Partition(int[] array , int left , int right){
		int pivoindex = getIndex(left , right);
		int mid = array[pivoindex];
		swap(array , pivoindex , right);
		int leftBound = left;
		int rightBound = right - 1;
		while(leftBound <= rightBound){
			if(array[leftBound] <= mid){
				leftBound++;
			}else if(array[rightBound] > mid){
				rightBound--;
			}else{
				swap(array , leftBound++ , rightBound--);
			}
		}
		swap(array , leftBound , right);
		return leftBound;
	}
	private void swap(int[] array , int i , int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	private int getIndex(int left , int right){
		return left + (int)(Math.random()*(right - left + 1));
	}

	public static void main(String[] args) {
		QuickSort solution = new QuickSort();

		int[] array = null;
		array = solution.quickSort(array);
		System.out.println(Arrays.toString(array));

		array = new int[0];
		array = solution.quickSort(array);
		System.out.println(Arrays.toString(array));

		array = new int[] { 1, 2, 3, 4 };
		array = solution.quickSort(array);
		System.out.println(Arrays.toString(array));

		array = new int[] { 4, 3, 2, 1 };
		array = solution.quickSort(array);
		System.out.println(Arrays.toString(array));

		array = new int[] { 2, 4, 1, 5, 3, 6 };
		array = solution.quickSort(array);
		System.out.println(Arrays.toString(array));

	}
}
