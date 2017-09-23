package binarySearch;

public class ClosestNumber {
	public int closestNumber(int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;
		}
		int left = 0;
		int right = array.length - 1;
		while (left < right - 1) {
			int mid = left + (right - left) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				left = mid;
			} else {
				right = mid;
			}
		}
		if (Math.abs(array[left] - target) <= Math.abs(array[right] - target)) {
			return left;
		} else {
			return right;
		}
	}

	public static void main(String[] args) {
		ClosestNumber solution = new ClosestNumber();
		int target = 7;
		int result;

		int[] array = null;
		result = solution.closestNumber(array, target);
		System.out.println(result);

		array = new int[0];
		result = solution.closestNumber(array, target);
		System.out.println(result);

		array = new int[] { 0, 1, 2, 4, 5, 8 };
		result = solution.closestNumber(array, target);
		System.out.println(result);

	}
}
