package binarySearch;

public class LastOccurence {
	public int lastOccurence(int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;
		}
		int left = 0;
		int right = array.length - 1;
		while (left < right - 1) {
			int mid = left + (right - left) / 2;
			if (array[mid] == target) {
				left = mid;
			} else if (array[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		if (array[right] == target) {
			return right;
		}
		if (array[left] == target) {
			return left;
		}
		return -1;
	}

	public static void main(String[] args) {
		LastOccurence solution = new LastOccurence();
		int target = 4;
		int result;

		int[] array = null;
		result = solution.lastOccurence(array, target);
		System.out.println(result);

		array = new int[0];
		result = solution.lastOccurence(array, target);
		System.out.println(result);

		array = new int[] { 0, 1, 1, 4, 4 };
		result = solution.lastOccurence(array, target);
		System.out.println(result);

	}
}
