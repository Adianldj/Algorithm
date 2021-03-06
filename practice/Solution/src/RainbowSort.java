import java.util.Arrays;

public class RainbowSort {
	public int[] rainbowSort(int[] array) {
		// Write your solution here.
		if(array == null || array.length <= 1){
			return array;
		}
		int neg = 0;
		int zero = 0;
		int one = array.length - 1;
		while(zero <= one){
			if(array[zero] == -1){
				swap(array , neg , zero);
				neg++;
				zero++;
			}else if(array[zero] == 0){
				zero++;
			}else{
				swap(array , zero , one);
				one--;
			}
		}
		return array;
	}

	private void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {
		RainbowSort solution = new RainbowSort();

		int[] array = null;
		array = solution.rainbowSort(array);
		System.out.println(Arrays.toString(array));

		array = new int[0];
		array = solution.rainbowSort(array);
		System.out.println(Arrays.toString(array));

		array = new int[] { 1, 2, 3, 4 };
		array = solution.rainbowSort(array);
		System.out.println(Arrays.toString(array));

		array = new int[] { 4, 3, 2, 1 };
		array = solution.rainbowSort(array);
		System.out.println(Arrays.toString(array));

		array = new int[] { 2, 4, 1, 5, 3, 6 };
		array = solution.rainbowSort(array);
		System.out.println(Arrays.toString(array));

	}
}
