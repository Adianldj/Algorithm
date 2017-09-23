import java.util.Arrays;

public class QuickSort {
	public int[] quickSort(int[] array) {
		// Write your solution here
		if (array == null || array.length <= 1) {
			return array;
		}
		quickSort(array, 0, array.length - 1);
		return array;
	}

	private void quickSort(int[] array, int left, int right) {
		if (left >= right) {
			return;
		}
		int pivoPos = Partition(array, left, right);
		quickSort(array, left, pivoPos - 1);
		quickSort(array, pivoPos + 1, right);
	}

	private int Partition(int[] array, int left, int right) {
		int pivoindex = Pivo(left, right);
		int value = array[pivoindex];
		swap(array, pivoindex, right);
		int leftBound = left;
		int rightBound = right - 1;
		while (leftBound <= rightBound) {
			if (array[leftBound] <= value) {
				leftBound++;
			} else if (array[rightBound] > value) {
				rightBound--;
			} else {
				swap(array, leftBound++, rightBound--);
			}
		}
		swap(array, leftBound, right);
		return leftBound;
	}

	private int Pivo(int left, int right) {
		return left + (int) (Math.random() * (right - left + 1));
	}

	private void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
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
