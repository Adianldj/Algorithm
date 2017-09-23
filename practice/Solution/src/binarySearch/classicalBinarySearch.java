package binarySearch;

public class classicalBinarySearch {
	public int binarySearch(int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;
		}
		int left = 0;
		int right = array.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		classicalBinarySearch solution = new classicalBinarySearch();
		int target = 5;
		int result;

		int[] array = null;
		result = solution.binarySearch(array, target);
		System.out.println(result);

		array = new int[0];
		result = solution.binarySearch(array, target);
		System.out.println(result);

		array = new int[] { 1, 2, 3, 4, 5 };
		result = solution.binarySearch(array, target);
		System.out.println(result);

	}
}
