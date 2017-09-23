package DP;

public class JumpGame {
	public boolean canJump(int[] array){
		boolean[] canJump = new boolean[array.length];
		canJump[0] = true;
		for(int i = 1 ; i < array.length ; i++){
			for(int j = 0 ; j < i ; j++){
				if(canJump[j] && array[j] + j >= i){
					canJump[i] = true;
					break;
				}
			}
		}
		return canJump[array.length - 1];
	}
	public static void main(String[] args) {
		JumpGame solution = new JumpGame();

		int[] array ={0, 0, 6, 0, 0};
		boolean result;
		result = solution.canJump(array);
		System.out.println(result);

		int[] array2 = {2, 1, 1, 0, 2};
		result = solution.canJump(array2);
		System.out.println(result);

		

	}
}
