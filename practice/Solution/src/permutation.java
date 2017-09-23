import java.util.Arrays;

public class permutation {
	public int[] solve(int[] array) {
		// Write your solution here.
		if (array == null || array.length <= 1) {
			return array;
		}
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			swap(array, min, i);
		}
		return array;

	}

	private void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {
		permutation solution = new permutation();

		int[] array = null;
		array = solution.solve(array);
		System.out.println(Arrays.toString(array));

		array = new int[0];
		array = solution.solve(array);
		System.out.println(Arrays.toString(array));

		array = new int[] { 1, 2, 3, 4 };
		array = solution.solve(array);
		System.out.println(Arrays.toString(array));

		array = new int[] { 4, 3, 2, 1 };
		array = solution.solve(array);
		System.out.println(Arrays.toString(array));

		array = new int[] { 2, 4, 1, 5, 3 };
		array = solution.solve(array);
		System.out.println(Arrays.toString(array));

	}
}
