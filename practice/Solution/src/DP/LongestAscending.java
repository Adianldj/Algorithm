package DP;


public class LongestAscending {
	public int Longest(int[] array){
		int maxlength = 1;
		if(array == null || array.length == 0){
			return 0;
		}
		int cur = 1;
		for(int i = 1 ; i < array.length ; i++){
			if(array[i] > array[i - 1]){
				cur = cur + 1;
				maxlength = Math.max(maxlength, cur);
			}else{
				cur = 1;
			}
		}
		return maxlength;
	}
	public static void main(String[] args) {
		LongestAscending solution = new LongestAscending();

		int[] array = null;
		int result;
		result = solution.Longest(array);
		System.out.println(result);

		array = new int[0];
		result = solution.Longest(array);
		System.out.println(result);

		array = new int[] { 1, 2, 3, 4 };
		result = solution.Longest(array);
		System.out.println(result);

		array = new int[] { 4, 3, 2, 1 };
		result = solution.Longest(array);
		System.out.println(result);

		array = new int[] { 2, 4, 1, 5, 3, 6 , 7};
		result = solution.Longest(array);
		System.out.println(result);

	}
}
