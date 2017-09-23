package DP;

public class CuttingRope {
	public int maxProduct(int length){
		if(length == 0){
			return 0;
		}
		int[] maxproduct = new int[length + 1];
		maxproduct[0] = 0;
		maxproduct[1] = 0;
		for(int i = 2 ; i <= length ; i++){
			for(int j = 1 ; j <= i / 2 ; j++){
				maxproduct[i] = Math.max(maxproduct[i], j * Math.max(maxproduct[i - j], i - j));
			}
		}
		return maxproduct[length];
	}
	public static void main(String[] args) {
		CuttingRope solution = new CuttingRope();

		int array = 0;
		int result;
		result = solution.maxProduct(array);
		System.out.println(result);

		array = 1;
		result = solution.maxProduct(array);
		System.out.println(result);

		array = 2;
		result = solution.maxProduct(array);
		System.out.println(result);

		array = 3;
		result = solution.maxProduct(array);
		System.out.println(result);

		array = 4;
		result = solution.maxProduct(array);
		System.out.println(result);

	}
}
