import java.util.Arrays;

public class MoveZero {
	public int[] moveZero(int[] array) {
		// Write your solution here.
		if (array == null || array.length <= 1) {
			return array;
		}
		int above = 0;
		int zero = array.length - 1;
		while (above <= zero) {
			if (array[above] == 0) {
				swap(array, above, zero);
				zero--;
			} else {
				above++;
			}
		}
		return array;
	}

	private void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}

	public static void main(String[] args) {
		MoveZero solution = new MoveZero();

		int[] array = null;
		array = solution.moveZero(array);
		System.out.println(Arrays.toString(array));

		array = new int[0];
		array = solution.moveZero(array);
		System.out.println(Arrays.toString(array));

		array = new int[] { 1, 2, 3, 4 };
		array = solution.moveZero(array);
		System.out.println(Arrays.toString(array));

		array = new int[] { 4, 3, 2, 1 };
		array = solution.moveZero(array);
		System.out.println(Arrays.toString(array));

		array = new int[] { 2, 4, 1, 5, 3, 6 };
		array = solution.moveZero(array);
		System.out.println(Arrays.toString(array));

	}

}
