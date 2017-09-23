package binarySearch;

import java.util.Arrays;

public class KClosest {
	public int[] kClosest(int[] array, int target, int k) {
		if (array == null || array.length == 0 || k == 0) {
			return new int[0];
		}

		int index = findClosest(array, target);
		int[] result = new int[k];
		result[0] = array[index];
		int left = index - 1;
		int right = index + 1;
		for (int i = 1; i < k; i++) {
			if ((left >= 0 && right >= array.length)
					|| (left >= 0 && Math.abs(array[left] - target) <= Math
							.abs(array[right] - target))) {
				result[i] = array[left];
				left--;
			} else {
				result[i] = array[right];
				right++;
			}
		}
		return result;
	}

	private int findClosest(int[] array, int target) {
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
		if (Math.abs(array[left] - target) < Math.abs(array[right] - target)) {
			return left;
		} else {
			return right;
		}
	}

	public static void main(String[] args) {
		KClosest solution = new KClosest();
		int target = 4;
		int k = 3;
		int[] result;

		int[] array = null;
		result = solution.kClosest(array, target, k);
		System.out.println(Arrays.toString(result));

		array = new int[0];
		result = solution.kClosest(array, target, k);
		System.out.println(Arrays.toString(result));

		array = new int[] { 0, 1, 1, 4, 5 };
		result = solution.kClosest(array, target, k);
		System.out.println(Arrays.toString(result));

	}
}
