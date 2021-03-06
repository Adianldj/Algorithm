package DP;




public class MergeStones {
	public int merge(int[] stones){
		if(stones == null || stones.length == 0){
			return 0;
		}
		int length = stones.length;
		int[][] cost = new int[length][length];
		int[][] subsum = new int[length][length];
		for(int i = 0 ; i < length ; i++){
			for(int j = i ; j >= 0 ; j--){
				if(j == i){
					cost[j][i] = 0;
					subsum[j][i] = stones[i];
				}else{
					cost[j][i] = Integer.MAX_VALUE;
					subsum[j][i] = subsum[j][i - 1] + stones[i];
					for(int k = j ; k < i ; k++){
						cost[j][i] = Math.min(cost[j][i] , cost[j][k] + cost[k + 1][i] + subsum[j][i]);
						
					}
				}
			}
		}
		return cost[0][length - 1];
	}
	public static void main(String[] args) {
		MergeStones solution = new MergeStones();

		int result;

		int[] array = new int[] { 4, 3, 3, 4 };
		result = solution.merge(array);
		System.out.println(result);

	
	}
}
