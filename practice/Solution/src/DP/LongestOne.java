package DP;





public class LongestOne {
	public int longest(int[] array){
		if(array == null || array.length == 0){
			return 0;
		}
		int cur = 0 , max = 0;
		for(int i = 0 ; i < array.length ; i++){
			if(array[i] == 0){
				cur = 0;
			}else{
				cur = cur + 1;
				max = Math.max(max, cur);
			}
			
		}
		return max;
	}
	public static void main(String[] args) {
		LongestOne solution = new LongestOne();
		int result;
		

		int[]array = new int[] { 0, 0, 0, 1 };
		result = solution.longest(array);
		System.out.println(result);

		

	}
}
