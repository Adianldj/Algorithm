package binarySearch;

public class FirstOccurence {
	public int firstOccurence(int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;
		}
		int left = 0;
		int right = array.length - 1;
		while (left < right - 1) {
			int mid = left + (right - left) / 2;
			if (array[mid] == target) {
				right = mid;
			} else if (array[mid] > target) {
				right = mid - 1;
			} else {

				left = mid + 1;
			}
		}
		if (array[left] == target) {
			return left;
		}
		if (array[right] == target) {
			return right;
		}
		return -1;

	}

	public static void main(String[] args) {
		FirstOccurence solution = new FirstOccurence();
		int target = 1;
		int result;

		int[] array = null;
		result = solution.firstOccurence(array, target);
		System.out.println(result);

		array = new int[0];
		result = solution.firstOccurence(array, target);
		System.out.println(result);

		array = new int[] { 0, 1, 1, 4, 5 };
		result = solution.firstOccurence(array, target);
		System.out.println(result);

	}
	
}
